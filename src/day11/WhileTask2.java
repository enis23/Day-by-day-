package day11;

import javax.swing.*;
import java.util.Scanner;


public class WhileTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write a text: ");
            String line = scanner.nextLine();

            if (line.equals("quit")) {
                break;
            }

            if (line.contains("#")) {
                System.out.println("Strong Password");
            }
            // part1. check for the @,$,* symbols also for a strong password
            if (line.contains("!") || line.contains("@") || line.contains("#") || line.contains("$")) {
                System.out.println("Strong Password");
            }
            //part 2
            else {
                System.out.println("Weak Password");
            }
            String x = line.toUpperCase();
            String y = line.toLowerCase();
            if (line.equals(x)) {
                System.out.println("use lowercase letters");
            }

            else if (line.equals(y)) {
                System.out.println("use uppercase letters");
            }
        }
    }
}
