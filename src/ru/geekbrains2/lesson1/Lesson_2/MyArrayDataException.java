package ru.geekbrains2.lesson1.Lesson_2;

public class MyArrayDataException extends NumberFormatException{
    private int i;
    private  int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
