package day7;

import java.util.Scanner;

public class UserInputTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number[0-3]: ");
        int number = scan.nextInt();
        if (number == 0) {
            System.out.println("zero");
        }
        if (number == 1) {
            System.out.println("One");
        }
        if (number == 2) {
            System.out.println("two");
        }
        if (number == 3) {
            System.out.println("three");
        }

    }
}
