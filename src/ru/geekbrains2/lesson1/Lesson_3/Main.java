package ru.geekbrains2.lesson1.Lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Kodiak", "Tiguan", "Rav4", "Outlender", "X-Trail", "Kodiak", "Rav4", "CX-5", "Karok", "X-Trail", "Tiguan", "Outlender", "Rav4", "Kodiak");
        Set<String> unique = new HashSet<String>(words);
        System.out.println(words.toString());
        System.out.println("Уникальные слова-модели: ");
        System.out.println(unique.toString());
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }


    }


}
