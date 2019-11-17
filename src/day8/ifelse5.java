package day8;

import java.util.Scanner;

public class ifelse5 {
    //write a program check what
    //number DataType it is? (byte,short, int , long)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("write a number please:");
        long number = scan.nextLong();

        if (number >= -128 && number <= 127) {
            System.out.println("data type is byte");
        } else if (number >= -32768 && number <= 32767) {
            System.out.println("data type is short");
        } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            System.out.println("data type is int");
        } else if (number >= -9864578986544566l && number <= Long.MAX_VALUE) {
            System.out.println("data type is long");
        }
    }
}
