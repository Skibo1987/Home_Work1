package ru.geekbrains2.lesson1;

public class Robot implements  Skills{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " прыгнул");
    }

    @Override
    public void ran() {
        System.out.println("Робот " + name + " побежал");
    }


}
