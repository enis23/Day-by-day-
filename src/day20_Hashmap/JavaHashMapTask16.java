package day20_Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaHashMapTask16 {
    //16. given map, print it like this:
    // Lemon 200
    // Apple 100
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Lemon", 200);
        map.put("Apple", 100);

        TreeMap<String, Integer> t1 = new TreeMap<>(Collections.reverseOrder());
        t1.put("Apple", 100);
        t1.put("Lemon", 200);
        for (Map.Entry m : t1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


    }
    }

