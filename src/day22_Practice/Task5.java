package day22_Practice;

import java.util.ArrayList;

public class Task5 {
    //    Write a Java program to remove a specific element from an arrayList.
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(2);
            list.add(4);
            list.add(6);
            System.out.println(list);
            list.remove(2);
            System.out.println(list);
        }
    }



