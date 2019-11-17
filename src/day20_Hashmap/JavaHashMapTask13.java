package day20_Hashmap;


import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask13
//13.calculate sum of items,
// size of map should be at least 5
{
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach",300);
        map.put("Cucumber", 400);
        map.put("Watermelon",500);

        int sum=0;
        for (Map.Entry<String,Integer> e:map.entrySet()){
            int price= e.getValue();

            sum+=price;//sum = sum + price;
        }
        System.out.println("Sum items: "+ sum);
    }

}
