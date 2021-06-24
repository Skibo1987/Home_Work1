package ru.geekbrains.Jome_Second;

public class Main {
    public static void main(String[] args) {
        if (summ(10, 20) == true) {
            System.out.println("true 2 числа");
        } else {
            System.out.println("false 2 числа");
        }
        if (negotiv_or_positiv(-10) == true) {
            System.out.println("положительное число");
        } else {
            System.out.println("отрицательное число");
        }
        TextChek("Hello", 10);
        Chek_year(1200);


    }

    public static boolean summ(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean negotiv_or_positiv(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void TextChek(String chek, int b) {
        for (int i = 0; i <= b; i++) {
            System.out.println(chek);
        }
    }

    public static boolean Chek_year(int a) {
        if (a % 100 == 0 && a % 400 != 0) {
            System.out.println("Обычный год");
            return false;
        } else if (a % 400 == 0 || a % 4 == 0) {
            System.out.println("Высокосный год");
            return true;
        } else {
            System.out.println("Обычный год");
            return false;
        }
    }
}
