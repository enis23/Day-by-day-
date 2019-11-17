package day19_HashSet;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask9 {
    //9. Write a Java program to copy one array list into another.
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");
        System.out.println("List 1: "+list1);

        ArrayList<String> list2 = new ArrayList<>();
        // write code here
        System.out.println("1. way");
        for (String element : list1) {
            System.out.println(element);
            list2.add(element);
        }
        // end of code
        System.out.println("List 2: "+list2);


    }
}