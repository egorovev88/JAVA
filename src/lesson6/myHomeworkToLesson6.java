package lesson6;

import lesson6.animals.Cat;
import lesson6.animals.Dog;

import java.util.Random;
import java.util.Scanner;

public class myHomeworkToLesson6 {
    public static void main(String[] args) {

        int distanceToRun;
        int distunceToSwim;
        int heightToJump;
        int turn ;
        int roundNumber = 1;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        Cat[] cats = {new Cat("Barsik", 500, 4),
                new Cat("Vasya", 350, 3),
                new Cat("Kuzya", 250, 2)
        };
        Dog[] dogs = {new Dog("Barboss", 700, 2, 30),
                new Dog("Druzhok", 800, 2, 40),
                new Dog("Tuzik", 400, 1, 15)
        };
        do {
            System.out.println(roundNumber + " круг препятствий");
            distanceToRun = random.nextInt(700);
            heightToJump = random.nextInt(2);
            distunceToSwim = random.nextInt(35);
            for (int i = 0; i <dogs.length ; i++) {
                dogs[i].run(distanceToRun);
                dogs[i].jump(heightToJump);
                dogs[i].swim(distunceToSwim);
            };
            distanceToRun = random.nextInt(450);
            heightToJump = random.nextInt(4);
            for (int i = 0; i <cats.length ; i++) {
                cats[i].run(distanceToRun);
                cats[i].jump(heightToJump);
                cats[i].swim(1);
            };
            System.out.println("выбирайтеследующее дествие: \n 1-новый круг без отдыха \n 2-отдых и новый круг \n 3-закончить тренировку ");
            do {
                turn = sc.nextInt();
            }while (turn<1 || turn>3) ;
            if (turn == 2) {
                for (int i = 0; i < dogs.length; i++) {
                    dogs[i].relax();
                }
                ;
                for (int i = 0; i < cats.length; i++) {
                    cats[i].relax();
                }
            };
            roundNumber++;
        }while (turn !=3);
    }
    
}
