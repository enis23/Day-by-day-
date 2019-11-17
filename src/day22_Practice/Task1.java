package day22_Practice;

import java.util.Arrays;

public class Task1 {
    //Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        int[] array1 = {
                5, 10, 15, 20, 25,
                2, 4, 6, 8, 10,
                3, 6, 9, 12};

        String[] array2 = {
                "Fruits",

                "lemon",
                "apple",
                "Banana",
                "Melon",
                "Watermelon"
        };

        System.out.println("First Numeric array : "+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted Numeric array : "+Arrays.toString(array1));

        System.out.println("First String array : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array : "+ Arrays.toString(array2));
    }
}
