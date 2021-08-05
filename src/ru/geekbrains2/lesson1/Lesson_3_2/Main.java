package ru.geekbrains2.lesson1.Lesson_3_2;

public class Main {
    public static void main(String[] args) {
    Notebook notebook= new Notebook();
        System.out.println("Давайте заполним созданный справочник...");
        notebook.add("Петров","91566677711");
        notebook.add("Сидоров","91599977711");
        notebook.add("Иванов","91577777711");
        notebook.add("Трифонов","91555577711");
        notebook.add("Васильев","91533377711");
        notebook.add("Петров","91598977711");
        System.out.println("******************************");

        System.out.println("Получим номера сотрудников....");
        System.out.println("Петров");
        System.out.println(notebook.get("Петров"));
        System.out.println("Трифонов");
        System.out.println(notebook.get("Трифонов"));
        System.out.println("******************************");

        System.out.println("Случай когда телефона сотрудника нет");
        System.out.println("Скибо");
        System.out.println(notebook.get("Скибо"));
        System.out.println("******************************");

        System.out.println("Случай добавления уже известного номера");
        notebook.add("Петров","91598977711");
        System.out.println("Петров");
        System.out.println(notebook.get("Петров"));

    }
}
