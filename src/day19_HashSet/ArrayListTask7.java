package day19_HashSet;

import java.util.ArrayList;

public class ArrayListTask7 {
    //7. Write a Java program to search an element in a array list.
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red"); // 0
        colors.add("White");// 1
        colors.add("Black"); // 2
        colors.add("Green");
        System.out.println(colors);

        // write your code here
        // print "It has Black color" if it has black color in arrayList
        // Hint: .contains method
        System.out.println("1. way");
        boolean containsBlack1 = false;
        for (String color : colors) {
            if (color.equals("Black")) {
                containsBlack1 = true;
            }

        }
        if (containsBlack1) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }


        System.out.println("2. way");
        boolean containsBlack2 = colors.contains("Black");
        if (containsBlack2) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }
    }
}