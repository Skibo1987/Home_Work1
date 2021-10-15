package ru.geekbrains2.lesson1.Lesson1;

public class Cat implements Skills{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " прыгнул");
    }

    @Override
    public void ran() {
        System.out.println("Кот " + name + " побежал");
    }
}
