package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String hiddenWord = new String();
        String tryWord = new String();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randomWordNumber = rand.nextInt(25) ;
        hiddenWord = words[randomWordNumber];
        System.out.println(Arrays.toString(words));
        System.out.println("ответ для проверки:" + hiddenWord);
        do {
            System.out.println("попробуйте угадать загаданное слово");
            tryWord = sc.nextLine();
            if (hiddenWord.equals(tryWord)) break;
            else {
                for (int i = 0; i < 15; i++) {
                    if (i<hiddenWord.length() && i<tryWord.length())
                    if (hiddenWord.charAt(i) == tryWord.charAt(i))
                        System.out.print(hiddenWord.charAt(i));
                    else System.out.print("#");
                    else System.out.print("#");
                }
                ;
                System.out.println();
            }
        }while ( !(hiddenWord.equals(tryWord)));
    }
}
