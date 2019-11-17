package day20_Hashmap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask14 {
    //14.print
// Apple Lemon Peach Cucumber Watermelon
// //100 200 300 400 500}

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 300);
        map.put("Cucumber", 400);
        map.put("Watermelon", 500);

//for (Map.Entry<String,Integer>e: map.entrySet()){
//    System.out.print(e.getKey()+" ");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
    }
}