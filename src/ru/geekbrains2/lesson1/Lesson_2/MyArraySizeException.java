package ru.geekbrains2.lesson1.Lesson_2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {

    private int i;
    private int j;

    public MyArraySizeException() {

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
