package ru.geekbrains.XOGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int Size = 3;
    public static final int DotsToWin = 3;
    public static int count = 0;
    public static final char DotEmpty = '.';
    public static final char DotX = 'X';
    public static final char DotO = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (verticalWin(DotX)) {
                System.out.println("Победил Человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (verticalWin(DotO)) {
                System.out.println("Победил ИИ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра Окончена");


    }

    public static void initMap() {
        map = new char[Size][Size];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DotEmpty;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= Size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < Size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < Size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в Формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DotX;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= Size || y < 0 || y >= Size) return false;
        if (map[x][y] == DotEmpty) return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(Size);
            y = rand.nextInt(Size);
        } while (!isCellValid(x, y));
        map[x][y] = DotO;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                if (map[i][j] == DotEmpty) return false;
            }
        }
        return true;
    }

//        public static boolean CheckWin(char symb) {

    //        for (int i = 0; i < Size; i++) {
//            int count=0;
//            if (map[i][count]==symb && DotsToWin==(count+1)){
//                return true;
//            }
//            count=count+1;
//            for (int j = 0; j < Size; j++) {
//                int h = 0;
//
//                if (map[i][j] == symb && h==Size) {
//                    h = h + 1;
//                }
//                return true;
//            }
//
//        }
//        return true;
//    }
    public static boolean verticalWin(char symb) {
        for (int i = 0; i < Size; i++) {
            if (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb) return true;
            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
            if (map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) return true;
            if (map[0][2]==symb && map[1][1] == symb && map[2][0]==symb) return true;

//            if (map[i][0] == symb && Size != count) {
//                count = count + 1;
//            }
//            return false;
//            if (map[i][1] == symb && Size == count) {
//                count = count + 1;
//            }
//            return true;
//            if (map[i][2] == symb && Size == count) {
//                count = count + 1;
//            }
//            return true;
        }
        return false;
    }

//    public static boolean horizontWin(char symb) {
//        for (int i = 0; i < Size; i++) {
//            count = count + 1;
//            if (map[0][i] == symb && Size == count)
//                return true;
//            if (map[1][i] == symb && Size == count)
//                return true;
//            if (map[2][i] == symb && Size == count)
//                return true;
//
//        }
//        return false;
//    }

}
