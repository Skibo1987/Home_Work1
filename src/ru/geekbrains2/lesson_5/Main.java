package ru.geekbrains2.lesson_5;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Main<arr> {
    static final int Size = 10_000_000;
    static final int HalfSize = Size / 2;

    public static void main(String[] args) {
        float[] arr = new float[Size];
        fillArr(arr);
        formula_1(arr);

        fillArr(arr);
        formula_2(arr);


    }

    public static void fillArr(float[] arr) {
        Arrays.fill(arr, 1);
    }

    public static void formula_1(float[] arr) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Formula total spending  time: " + (endTime - startTime) + " ms");
        System.out.println(arr[HalfSize]);
    }

    public static void formula_2(float[] arr) {
        long startTime = System.currentTimeMillis();
        float[] arr1 = new float[HalfSize];
        float[] arr2 = new float[HalfSize];

        System.arraycopy(arr, 0, arr1, 0, HalfSize);
        System.arraycopy(arr, HalfSize, arr2, 0, HalfSize);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (i+HalfSize) / 5) * Math.cos(0.2f + (i+HalfSize) / 5) * Math.cos(0.4f + (i+ HalfSize)/ 2));
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(arr1,0,arr,0,HalfSize);
        System.arraycopy(arr2,0,arr,HalfSize,HalfSize);
        long endTime = System.currentTimeMillis();
        System.out.println("Formula total spending time: " + (endTime-startTime)+" ms");
        System.out.println(arr[HalfSize]);


    }

}
