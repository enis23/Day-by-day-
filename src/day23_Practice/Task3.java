package day23_Practice;

import java.util.Arrays;

public class Task3 {
    //    Write a Java program to find the smallest element in an array.
    //{1,23,34,345,3,666,5,7,6}
    public static void main(String[] args) {
        int[] numbers = {1, 34, 66, 1000, 23, 4, 7, 9};
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}