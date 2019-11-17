package day11;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ForTask2 {
    //write a program which prints even numbers up to 10
    //ex: 0, 2, 4, 6, 8

    // hint:
    // if( x%2 ==0 ) => even
    // else => odd
    public static void main(String[] args) {
        //part 1
//        for (int i = 0; i < 10; i++)
//            if (i % 2 == 0) {
//                System.out.println(i);
        //part2
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Provide max number: ");
//
//        int max = scan.nextInt();
//        for (int i = 0; i <= max; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//      part 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide min number: ");
        int min = scan.nextInt();
        System.out.println("Provide max number: ");
        int max = scan.nextInt();
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }}}}

    

