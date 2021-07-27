package ru.geekbrains2.lesson1;

public class Main {
    public static void main(String[] args) {
        int a=5;
        Human man1 = new Human("Alexey");
        Robot bot = new Robot("E2E4");
        Cat cat = new Cat("Barsik");
        Skills[] sk = {man1, bot, cat};
        for (int i = 0; i < sk.length; i++) {
            sk[i].jump();
            sk[i].ran();
        }
        public void Test(){
            System.out.println(jump);
        }


    }

}
