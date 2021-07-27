package ru.geekbrains2.lesson1.Lesson_3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Notebook {
    private HashMap<String, List<String>> book;

    public Notebook() {
        this.book = new HashMap<>();
    }

    public void add(String surname, String telefon) {
        if (book.containsKey(surname)) {
            List<String> numbers = book.get(surname);
            if(!numbers.add(telefon)){
                numbers.add(telefon);
                System.out.println(String.format("Телефонный номер %s добавлен для Фамилии %s", telefon, surname));
            } else {
                System.out.println(String.format("Телефонный номер %s для Фамилии %s уже существует", telefon, surname));
            }
            }else {
            book.put(surname,new ArrayList<>(Arrays.asList(telefon)));
            System.out.println(String.format("Телефон %s добавлен для фамилии %s",telefon,surname));
        }

    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        }else{
            System.out.println(String.format("Справочник не содержит телефонного номера для фамилии %s)",surname));
            return new ArrayList<>();
        }
    }
}
