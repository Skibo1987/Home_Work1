package ru.geekbrains.Home_Seven;

import java.util.Scanner;

public class Main {
    private Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {


        Cat[] cat = {new Cat("Рыжик",30,false),
                new Cat("Барсик",35,false),
                new Cat("Мурка",20,false),
                new Cat("Мася",25,false)
        };

        Plate plate = new Plate(150);


        System.out.println(plate);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            System.out.println(plate);
        }






    }
}
