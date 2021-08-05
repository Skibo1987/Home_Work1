package ru.geekbrains.Home_Six;

public class Animal {
    private int run;
    private int swim;
    private String name;

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;

    }

    public void info(String name) {
        System.out.println("Имя животного:" + name);
    }
}
