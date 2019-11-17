package day22_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
//    Write a Java program to sort in reverse order a numeric array
//    {3, 5, 10, 1} => {1, 3, 5, 10} => {10, 5, 3, 1}

    public static void main(String[] args) {
        int[] numbers = {3, 5, 10, 1};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for(int i = numbers.length-1; i>=0; i--){
            System.out.print(numbers[i]+" ");

        }

        //part2, copy reverse ordered array to new array;
        int[] reversedNumbers = new int[numbers.length];
        System.out.println(Arrays.toString(reversedNumbers));
        //output should be [10, 5, 3, 1]
    }
}


