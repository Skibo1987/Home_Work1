package ru.geekbrains.Home_Seven;

import java.util.Scanner;

public class Plate {
    private int food;



    public Plate(int food) {
        this.food = food;
    }


    public boolean decrease(int ammount) {
        if (ammount >= 0 && food > ammount) {
            food -= ammount;
            return true;
        } else {
            System.out.println("Food is not enough: " + food);

        }
        return false;
    }

    public void increase(Scanner ammount) {
        food = ammount.nextInt();
    }


    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

}
