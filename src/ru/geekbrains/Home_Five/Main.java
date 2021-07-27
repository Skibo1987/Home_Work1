package ru.geekbrains.Home_Five;

import java.lang.reflect.Array;
import java.util.Arrays;

import static ru.geekbrains.Home_Five.employee.*;

public class Main {
    public static void main(String[] args) {
        employee employee1 = new employee("Ivan Morozow", "worker", "i.morozov@mail.ru", 1010, 30000, 45);
        employee employee2 = new employee("Pavel ivanov", "meneger", "p.ivanov@mail.ru", 1020, 70000, 42);
        employee employee3 = new employee("Ivan Petrov", "ingeneer", "i.petrov@mail.ru", 1030, 75000, 30);
        employee employee4 = new employee("Vasily Ivanov", "programmer", "v.ivanov@mail.ru", 1040, 100000, 35);
        employee employee5 = new employee("Vladimir Vasiliev", " senior ingeneer", "v.vasiliev@mail.ru", 1050, 110000, 41);
        employee1.info();
        System.out.println(employee2);
        employee[] employeeArray = new employee[5];
        employeeArray[0] = employee1;
        employeeArray[1] = employee2;
        employeeArray[2] = employee3;
        employeeArray[3] = employee4;
        employeeArray[4] = employee5;
        System.out.println(employee1.getage());
        employee[] employeesSE={
                new employee("Ivan Morozow", "worker", "i.morozov@mail.ru", 1010, 30000, 45),
                new employee("Pavel ivanov", "meneger", "p.ivanov@mail.ru", 1020, 70000, 42),
                new employee("Ivan Petrov", "ingeneer", "i.petrov@mail.ru", 1030, 75000, 30),
                new employee("Vasily Ivanov", "programmer", "v.ivanov@mail.ru", 1040, 100000, 35),
                new employee("Vladimir Vasiliev", " senior ingeneer", "v.vasiliev@mail.ru", 1050, 110000, 41)
        };
        for (int i = 0; i < employeesSE.length; i++) {
            if (employeesSE[i].getage() >= 40) {
                System.out.println();
                employeesSE[i].info();
                System.out.println();
            }
        }
    }
}
