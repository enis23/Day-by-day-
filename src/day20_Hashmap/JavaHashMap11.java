package day20_Hashmap;

import java.util.HashMap;
import java.util.Set;

public class JavaHashMap11
{//11. Write a Java program to get a set view of the keys contained in this map.

    public static void main(String[] args) {
        HashMap<Character,Boolean>map=new HashMap<>();
        map.put('A', true);
        map.put('B', true);
        map.put('C', false);

        //print=>A B C
        Set<Character> characters = map.keySet();
        System.out.println(characters);
        for (Character character:characters){
            System.out.println(character);
        }

    }
}
