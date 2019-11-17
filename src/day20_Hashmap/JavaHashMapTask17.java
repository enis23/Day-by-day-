package day20_Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaHashMapTask17 {
    //17. Given map, update the values
    // Apple 333
    // Lemon 444
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 333);
        map.put("Lemon", 444);
        System.out.println(map);

//        TreeMap<String, Integer> t1 = new TreeMap<>(Collections.reverseOrder());
//        t1.put("Lemon", 444);
//        t1.put("Apple", 333);
//        for (Map.Entry m : t1.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//            //part2. suppose you have large map, and you need to check
//            // if you have "Apple" there, if you have apple, only then change
//            // its value to 500
//            //Hint:.contains method
            if (map.containsKey("Apple")) {
                map.put("Apple", 500);
            }
            System.out.println(map);

        }
    }





