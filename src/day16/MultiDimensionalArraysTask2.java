package day16;

import java.util.Random;

public class MultiDimensionalArraysTask2 {
//TODO Using 2D Array fill the table of exam(examResult array)
// exam is provided with percentages 0-100%
//              JAVA  Math  English
//    Max      ???      ???       ???
//    Bayram  ???      ???       ???

    //part1. give number
    //part2, print all results, USING NESTED LOOP

    public static void main(String[] args) {
        //part1
        int[][] examResult = {
                {10, 40, 45},
                {99, 88, 77}
        };
        //part2



//        System.out.println("length------");
//        for (int row = 0; row < examResult.length; row++) {
//            for (int col = 0; col < examResult[row].length; col++) {
//                System.out.print(examResult[row][col] + " ");
//           examResult[row][col]=0;
                System.out.println("Length: " + examResult[0].length);
                Random random = new Random();
                for (int row = 0; row < examResult.length; row++) {
                    for (int col = 0; col < examResult[row].length; col++) {
                        //part2.1
                        examResult[row][col] = random.nextInt(100);
                        System.out.print(examResult[row][col]+ " ");}

            System.out.println();
        }


    }
}