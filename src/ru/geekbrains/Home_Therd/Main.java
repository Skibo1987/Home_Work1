package ru.geekbrains.Home_Therd;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Zamena();
        massivsto();
        massivtri();
        massivfour();
        massivfive(5, 21);
        massiv_max();
        massiv_min();
    }

    public static void Zamena() {
        int[] nums = {1, 0, 1, 0, 1, 1, 0, 0, 0, 1};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void massivsto() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void massivtri() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void massivfour() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == arr.length - i-1) {
                    arr[i][j] = 1;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] massivfive(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void massiv_max() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int x = rand.nextInt(20);
            arr[i] = x;
        }
        System.out.println(Arrays.toString(arr));
       int max_nomber=0;
       for (int i=0; i<arr.length; i++){
           if(max_nomber<=arr[i]){
               max_nomber=arr[i];
           }
       }
        System.out.println("max_number"+max_nomber);

    }
    public static void massiv_min() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int x = rand.nextInt(20);
            arr[i] = x;
        }
        System.out.println(Arrays.toString(arr));
        int min_nomber=20;
        for (int i=0; i<arr.length; i++){
            if(min_nomber>=arr[i]){
                min_nomber=arr[i];
            }
        }
        System.out.println("min_number"+min_nomber);

    }

}
