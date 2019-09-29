package lesson1;

public class lesson1 {

public static void main(String[] args) {
        byte varByte = 10;
        short varShot = 15;
        int varInt = 25;
        long varLong = 31310L;
        float varFloate = 3.56F;
        double varDouble = 25.2324D;
        char varChar = 't';
        boolean varBoolean = false;
        int var1 = 5;
        int i = calculate(varByte, varShot, varInt, var1);
      //  System.out.println(i);
      //  System.out.println(task10and20(13,15));
      //  isPositiveOrNegative(0);
      //  System.out.println(isNegative(0));
      //  greeting("Kate");
        leapYear(2000);
        }

public static int calculate(int a, int b, int c, int d) {
        int rezult = a * (b + c / d);
        return rezult;
        }
public static boolean task10and20 (int x1, int x2) {
        boolean rezult;
        if ((x1+x2)>=10 && (x1+x2)<=20) rezult = true;
        else rezult = false;
        return rezult;
}
public static void isPositiveOrNegative (int x){
        if (x>=0) System.out.println("число положительное");
        else System.out.println("число отрицательное");
}
public static boolean isNegative (int x){
        if (x<0) return true;
        else return false;
}
public static void greeting (String name){
    System.out.println("Привет, " + name +"!");
}
public static void leapYear (int x){
        int req1 = x/4;
        int req2 = x/100;
        int req3 = x/400;
        if (((x-req1*4==0) && (x-req2*100!=0)) || (x-req3*400==0))System.out.println("год високосный");
        else System.out.println("год невисокосный");
}
}