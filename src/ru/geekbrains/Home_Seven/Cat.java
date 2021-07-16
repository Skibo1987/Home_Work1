package ru.geekbrains.Home_Seven;

import java.util.Scanner;

public class Cat {
    private String name;
    private int appetit;
    private boolean sitost;
    private Scanner sc = new Scanner(System.in);

    public Cat(String name, int appetit, boolean sitost) {
        this.name = name;
        this.appetit = appetit;
        this.sitost = sitost;
    }

    public void eat(Plate plate) {
        System.out.println(name + " eat ....");
        if (plate.decrease(appetit)) {
            sitost = true;
            System.out.println("Cat is not hungry");
        } else {
            System.out.println("Cat is hungry");
            System.out.println("Add Food");
            plate.increase(sc);
        }

    }
//    public void add(Plate plate){
//        if(plate.decrease(appetit)==false){
//
//        }
//    }

}
