package day20_Hashmap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask8 {
    //8. Write a Java program to test if a
    //   map contains a mapping for the specified value.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("map 1: " + map);
        String value = "Green";
        if (map.containsValue(value)) {
            System.out.println("It has Green");
        } else {
            System.out.println("It has not ");
        }
        //part 2 , try to check it using Loop, without .containsValue
        //method.Print key if you have value in map.
for (Map.Entry<Integer, String>entry: map.entrySet()){
    Integer entryKey=entry.getKey();
    String entryValue=entry.getValue();

    if (entryValue.equals("White")){
        System.out.println("key is : "+ entryKey);
    }
}


    }
}