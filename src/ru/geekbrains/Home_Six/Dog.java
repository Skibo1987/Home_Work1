package ru.geekbrains.Home_Six;

public class Dog extends Animal {
    public void info(String name) {
        System.out.println("Имя животного:" + name);
    }
    public Dog(int run, int swim) {
        super(run, swim);
        if (run > 0 && run <= 500) {
            System.out.println("Собака пробежала: " + run);
        } else {
            System.out.println("Собака бежит до 500м");
        }
        if (swim > 0 && swim <= 10) {
            System.out.println("Собака проплыла: " + swim);
        } else {
            System.out.println("Собака плывет до 10м");
        }
    }
}
