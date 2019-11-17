package day23_Practice;

public class Task1 {
    // write a java program that find maximum
    // of two numbers
    public static void main(String[] args) {
        int a = 10;
        int b = 400;

        // 1. way
        if (a >= b) {
            System.out.println("max is:" + a);
        } else {
            System.out.println("max is:" + b);
        }

        // 2.way
        int max = Math.max(a, b);
        System.out.println("Max is:" + max);
//        Math.min()
//        Math.max()
//        Math.sqrt()
//        Math.random()
//        Math.abs()

        //3. way
        int max2 = (a >= b) ? a : b;
        System.out.println("Max2 is:" + max2);
    }

}