package lesson4;

import java.util.Random;
import java.util.Scanner;


public class myHomeorkToLesson4 {
    static final int SIZE = 5 ;
    static final int WINSIZE = 4;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char [][] map ;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        boolean win = false;
        initMap ();
        printMap ();
        do {
            humanTurn();
            printMap();
            if (!(isNotFull())) break;
            if (checkWin(DOT_X)){
                System.out.println("вы победили");
                win = true;
                break;
            }
            computersTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("вы проиграли");
                win = true;
                break;
            }
        }while (isNotFull());
        if (!win)
            System.out.println("ничья");

    }
    public static void initMap (){
        map = new char [SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE ; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap (){
        System.out.print("   ");
        for (int i = 1; i <= SIZE ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE ; j++) {
                System.out.print(" " + map[i][j]);
            }
            System.out.println();
        }
    }
    public static void humanTurn (){
        int x,y;
        do {
            System.out.println("введите координаты хода");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (x >= SIZE || y >= SIZE || x < 0 || y < 0 || (!checkValid(y,x)));
        map[y][x] = DOT_X;
    }
    public static void computersTurn (){
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!(checkValid(x,y)));
        map[x][y] = DOT_O;
    }
    public static boolean checkValid (int x, int y){
        if (map [x][y] == DOT_EMPTY)
            return true;
        else
            return false;
    }
    public static boolean isNotFull (){
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE ; j++) {
                if (map [i][j] == DOT_EMPTY) return true;
            }
        }
        return false;
    }
    public static boolean checkWin (char ch){
        int counter , add;
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++) {

                counter = 0;
                add = 0;
                while (((i + add) < SIZE) && (counter < WINSIZE) && (map[i + add][j] == ch)) {
                    counter++;
                    add++;
                }
                if (counter == WINSIZE) return true;
                else {
                    counter = 0;
                    add = 0;
                    while (((j + add) < SIZE) && (counter < WINSIZE) && (map[i][j + add] == ch)) {
                        counter++;
                        add++;
                    }
                    if (counter == WINSIZE) return true;
                    else {
                        counter = 0;
                        add = 0;
                        while (((i + add) < SIZE) && ((j + add) < SIZE) && (counter < WINSIZE) && (map[i + add][j + add] == ch)) {
                            counter++;
                            add++;
                        }
                        if (counter == WINSIZE) return true;
                        else {
                            counter = 0;
                            add = 0;
                            while (((i - add) >= 0) && ((j + add) < SIZE) && (counter < WINSIZE) && (map[i - add][j + add] == ch)) {
                                counter++;
                                add++;
                            }
                            if (counter == WINSIZE) return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
