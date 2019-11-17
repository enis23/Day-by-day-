package day7;

import java.util.Scanner;

public class userinputtask2 {
    //Write a program that ask two number,
    //in your console it should print same as below:
    //Provide a first number:
    //3
    //your first number is 3
    //provide a second number
    //5
    //your second number is 5{
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Provide a first number:");
            int first = scan.nextInt();
            System.out.println("Your first number is " + first);

            System.out.println("Provide a second number:");
            int second = scan.nextInt();
            System.out.println("Your second number is " + second);

            int sum = first + second;
            System.out.println("Sum is " + sum);

        }
    }

