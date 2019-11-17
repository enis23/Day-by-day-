package day20_Hashmap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask1 {
//1. Write a Java program to
// associate the specified value with the specified key in a HashMap.

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("red",1);
        map.put("blue",2);
        map.put("green",3);
        map.put("yellow",4);
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer point = entry.getValue();
            System.out.println(name + " " + point);
        }
    }
}
