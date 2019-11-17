package day20_1_Practice;

import java.util.HashMap;

public class PutValue3 {
    // Put first names and last names into your map, and print
    public static void main(String[] args) {
        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};
        //write you code here
        HashMap<String, String> people = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            String key = firstNames[i];
            String value = lastNames[i];
            people.put(key, value);
            //end of you code

            //output:
            //{Max=Smith,Drake=Jones,Susan=Miller}
        }
        System.out.println(people);
    }
}