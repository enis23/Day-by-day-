package day20_1_Practice;

import java.util.HashMap;

public class PutValue2 {
    // Given map, put Strings into map
    public static void main(String[] args) {
        String[] names = {"Max", "Drake", "Susan"};
        HashMap<Character, Integer> map = new HashMap<>();
        //write you code here
        HashMap<String, Integer> mymap=new HashMap<>();
        for (String name: names){
            mymap.put(name,0);
        }
        //end of you code
        System.out.println(mymap);
        //output:
        //{"Max"=0,"Drake"=0,"Susan"=0}
    }
}