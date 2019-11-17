package day32.task;

import java.util.ArrayList;

public class Task2 {
    // Write a program with a method named printSum
    // that accepts ArrayList of integers as an argument and print its sum.

    public static void main(String[] args) {
    int sum = 0;
    ArrayList<Integer> list = new ArrayList<>();
    list.add(4);
    list.add(90);
    list.add(10);
    list.add(5);

    printSum(list);

}

    public static void printSum(ArrayList<Integer> numbers) {
    int sum=0;
    for(Integer number:numbers){
        sum+=number;

        System.out.println(sum);
    }
    }
    }
