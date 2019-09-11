public class lesson1() {

public static void main(String[] args) {
        byte varByte = 10;
        short varShot = 15;
        int varInt = 25;
        long varLong = 31310L;
        float varFloate = 3.56F;
        double varDouble = 25.2324D;
        char varChar = true;
        boolean varBoolean = false;
        int var1 = 5;
        int i = calculate(varByte, varShot, varInt, var1);
        System.out.println(i);
        }

public static int calculate(int a, int b, int c, int d) {
        int rezult = a * (b + c / d);
        return rezult;
        }
}