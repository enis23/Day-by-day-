package day7;

import java.util.Scanner;

public class UserInputTask3 {
    public static void main(String[] args) {
        //check if your number is positive or negative with scanner
        //where number is -200<=N<=200
        //ex: -123=>negative
        //ex: 10 =>positive
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number: ");
        int number = scan.nextInt();

        System.out.println(number);
        if (number < 0) {
            System.out.println("Negative");
        }
        if (number > 0) {
            System.out.println("Positive");
        }
        if (number == 0) {
            System.out.println("it's ZERO");
        }
    }
}


