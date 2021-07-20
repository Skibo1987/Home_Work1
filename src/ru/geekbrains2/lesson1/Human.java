package ru.geekbrains2.lesson1;

public class Human implements Skills {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " прыгнул");
    }

    @Override
    public void ran() {
        System.out.println("Человек " + name + " побежал");
    }
}
