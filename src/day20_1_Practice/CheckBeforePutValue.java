package day20_1_Practice;

import java.util.HashMap;

public class CheckBeforePutValue {
    // put only 'h' letter as keys into your HashMap,
    // put value = 0
    //hint:use if statement
    public static void main(String[] args) {
        String sentence = "hello";

        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {
            if(letter == 'h') {
                letterMap.put(letter, 0);
            }
        }

        System.out.println(letterMap);
        // {h=0}
    }
}