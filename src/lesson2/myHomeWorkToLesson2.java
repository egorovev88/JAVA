package lesson2;
import com.sun.javaws.IconUtil;

import java.util.Arrays;
import java.util.Scanner;

public class myHomeWorkToLesson2 {
    public static void main(String[] args) {

        int[] array = {0, 1, 1, 0, 0, 1};
        int[] array2 = new int[8];
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] array6 = new int [10];
        Scanner in = new Scanner(System.in);
        inversion(array);
        fillingArrTask2(array2);
        mul2IfLess6(array3);
//        System.out.println("введите размер квадратного массива:");
//        int size = in.nextInt();
//        int[][] array4 = new int[size][size]; //массив
//        makeDiagonals1(array4);
//        otput2dimensialArray(array4);
//        fillingArrRandom(array2);
//        System.out.println(Arrays.toString(array2));
//        lookinForMax(array2);
//        lookinForMin(array2);
        fillingArrRandom(array6);
        System.out.println(Arrays.toString(array6));
        System.out.println(checkBallance(array6));
        shiftArrayForNPosition( array6, 4);
        System.out.println(Arrays.toString(array6));

//    System.out.println(Arrays.toString(array3));

    }

    public static int[] inversion(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        return arr;
    }

    public static void otput2dimensialArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++)
                System.out.print(arr[i][k] + " ");
            System.out.println();
        }
    }

    public static int[] fillingArrTask2(int[] arr) {
        byte val = 0;
        for (int i = 0; i < 8; i++) {
            arr[i] = val;
            val += 3;
        }
        return arr;
    }

    public static int[] mul2IfLess6(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6) arr[i] *= 2;
        return arr;
    }

    public static int[][] makeDiagonals1(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int k = 0; k < arr.length; k++)
                if ((i == k) || (i + k) == (arr.length - 1))
                    arr[i][k] = 1;
        return arr;
    }

    public static void lookinForMin(int[] arr) {
        int min = arr[0], posMin = 0, count = 1;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];
                posMin = i;
                count = 1;
            }
            else
            if (arr[i] == min)
                count++;
        System.out.println("минимальный элемент = " + min + "; его индекс: " + posMin + "; таких элемнтов в массиве: "+ count);
    }
    public static void lookinForMax(int[] arr) {
        int max = arr[0], posMax = 0, count = 1;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
                posMax = i;
                count = 1;
            }
            else
                if (arr[i] == max)
                    count++;
        System.out.println("максимальный элемент = " + max + "; его индекс: " + posMax + "; таких элемнтов в массиве: "+ count);
    }
    public static int[] fillingArrRandom (int [] arr){
        for (int i=0 ; i < arr.length ; i++)
            arr[i] = (int) (Math.random() * 100);
    return arr;
    }
    public static boolean checkBallance (int [] arr){
        for (int i = 0 ; i < arr.length ; i++){
            int left = 0, right = 0;
            for (int k = 0 ; k < arr.length ; k++) {
                if (k <= i) left += arr[k];
                else
                    right += arr[k];
            }
            if (left == right) return true;
        }
        return false;
    }
    public static int[] shiftArrayForNPosition (int[] arr, int n){
        int buf;
            for ( int i = 0 ; i < n ; i++){
                buf = arr [0];
                for ( int k = 0 ; k < arr.length - 1; k++)
                    arr[k] = arr[k+1];
                arr[arr.length-1] = buf;
            }
        return arr;
    }
}
