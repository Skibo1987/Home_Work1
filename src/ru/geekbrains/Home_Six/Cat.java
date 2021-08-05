package ru.geekbrains.Home_Six;

public class Cat extends Animal {
    public void info(String name) {
        System.out.println("Имя животного:" + name);
    }
    public Cat(int run, int swim ) {
        super(run, swim);
        if (run > 0 && run <= 200) {
            System.out.println("Кошка пробежала: " + run);
        } else {
            System.out.println("Кошка бежит до 200м");
        }
        if (swim > 0) {
            System.out.println("Кошка плавать не умеет");
        }
    }

}
