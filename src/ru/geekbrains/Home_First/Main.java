package ru.geekbrains.Home_First;

public class Main {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_ Banana");
        System.out.println("_ Apple");
    }
    public static void checkSumSign(){
        int a=-10;
        int b=50;
        int c=a+b;
        if(c>=0){
            System.out.println("Сумма положительная");
        }else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value=110;
        if(value<=0){
            System.out.println("Красный");
        }
        if(value>0 && value<=100){
            System.out.println("Желтый");
        }
        if (value>100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a=24;
        int b=23;
        if (a>=b){
            System.out.println("a>=b");
        }else {
            System.out.println("a<b");
        }
    }
}
