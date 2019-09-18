package lesson3;

import java.util.Random;
import java.util.Scanner;

public class myHomeworkToLesson3 {
    public static void main(String[] args) {
        byte flag = 0;
        int sc = 0;
        Scanner scannerX = new Scanner(System.in);
        do {
            int x = getRandomNumber();
            System.out.println("ответ для проверки:7" + x);
            System.out.println("Угадайте число от 0 до 9");
            for (int i = 0; i < 3; i++) {
                sc = scannerX.nextInt();
                if (sc == x) {
                    System.out.println("угадал");
                    break;
                }
                else System.out.println("не угадал. попробуй еще");
            }
            if (sc == x) System.out.println("Победа!!! Еще раз? 1-да/0-нет");
            else System.out.println("Ты проиграл :( Еще раз? 1-да/0-нет ");
            flag = scannerX.nextByte();
        }while (flag == 1);
    }
    public static int getRandomNumber (){
        Random randomX = new Random();
        return randomX.nextInt(9);
    }
}
