package day8;

import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //write a program that print temperature in human readable words
        //ex: 70=> hot
        int temperature = scan.nextInt();
        if (temperature >= 70) {
            System.out.println("hot");
        } else if (temperature < 70 && temperature >= 50) {
            System.out.println("warm");
        }
    }
}
