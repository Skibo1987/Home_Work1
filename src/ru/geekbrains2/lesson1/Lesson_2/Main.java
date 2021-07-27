package ru.geekbrains2.lesson1.Lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "4", "3", "4"}, {"1", "2", "3", "4"}};
        try {


            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
            System.out.println("Конец программы");
        } catch (MyArrayDataException e) {
            System.out.println("Неправильно значение массива!");
            System.out.println("Ошибка в ячейке:" + e.getI() + e.getJ());
        }
        System.out.println("Конец программы");
    }

    public static int method(String[][] arr) {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }


}
