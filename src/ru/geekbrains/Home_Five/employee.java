package ru.geekbrains.Home_Five;

public class employee {
    private String FullName;
    private String Position;
    private String email;
    private long telefon;
    private int salary;
    private int age;


    public employee(String FullName, String Position, String email, long telefon, int salary, int age) {
        this.FullName = FullName;
        this.Position = "Менеджер";
        this.email = Position;
        this.telefon = telefon ;
        this.salary = salary;
        this.age = age;
        System.out.println("FullName: " + FullName + "   " + "Position: " + Position + "   " + "email: " + email + "   " + "telefon: " + telefon + "   " + "salary: " + salary + "   " + "age: " + age);
    }

    public void info() {
        System.out.println("FullName: " + FullName + "   " + "Position: " + Position + "   " + "email: " + email + "   " + "telefon: " + telefon + "   " + "salary: " + salary + "   " + "age: " + age);
    }

    public int getage() {
        return age;

    }

}
