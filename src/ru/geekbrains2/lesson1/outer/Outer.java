package ru.geekbrains2.lesson1.outer;

public class Outer {


    private class Wall{
        public void pintA(){
            System.out.println(a);
        }
        public void jumpwall(){
            for (int i = 0; i < sk.length; i++) {
                System.out.println(sk[i].jump);
            }

        }
    }
    private class Runway{
        void run(){
            for (int i = 0; i < sk.length; i++) {
                System.out.println(sk[i]);
            }

        }
    }
}
