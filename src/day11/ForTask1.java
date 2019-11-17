package day11;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//day32.task 1 write a program that takes "a" and "b" numbers
// from console, and show multiplication up to that "a" number
// ex: a = 3, b = 2
//     2 => 2 * 1
//     4 => 2 * 2
//     6 => 2 * 3
public class ForTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a:");
        int a= scan.nextInt();
        System.out.println("provide b:");
        int b=scan.nextInt();

        for(int i = 1; i <= a; i++){
            System.out.println(i * b);
    }
}}
