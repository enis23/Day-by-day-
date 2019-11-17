package day20_Hashmap;



import java.util.*;



public class JavaHashMapTask18 {

    //17. Count characters in string

    //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"

    // for ex:

    // A: 2

    // B: 1

    // ...

    //part 1

    // print every character in separate line



    //part2

    // put every character in to one HashSet



    //part3

    // put every character in HashMap<Character, Integer>, use value 0



    //part4

    // when you are putting character, check if you have that character already,

    // if you have, increment value, if you dont have just add character to map



    //part5

    //print HashMap





    public static void main(String[] args) {



        //heap = reference data type

        //stack = value type

        int x = 42;

        int y = x;

        //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"

        //part 1

        // print every character in separate line

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        String s = "BECOME A SOFTWARE TESTER IN 6 MONTHS";

        char[] ch = s.toCharArray();



        for (char c : ch) {

            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);

            } else {

                map.put(c, 1);

            }

        }

        Set<Character> keySet  = map.keySet();



        Collection<Integer> values  = map.values();



        System.out.println(map);



        Integer value = map.get("and");



        int[] a = {34, 4, 5, 6, 4, 3, 5};

        Arrays.sort(a);



        //need to find how many times the word "and" repeats.

        //which data structure



        //take the sentence, you split the words by " "

        //loop the words in the text file

        //you compare if(word =="and")

        // int counter++;

//        ArrayList<String>

//        HashMap<>

        String str = "take the sentence, you split the words by";

        String[] words = str.split(" ");



        HashMap<String, Integer> addCounter = new HashMap<>();

        int counter = 1;

        for (String word : words) {



            if (!addCounter.containsKey(word)) {

                addCounter.put(word, 1);

            } else {

//                counter = addCounter("take", 2);

                counter = addCounter.get(word); //==gets me the value

                addCounter.put(word, counter++);

            }



        }



        String sentence = "BECOME A SOFTWARE TESTER IN 6 MONTHS";

//        System.out.println("1. way");

//        for (int i = 0; i < sentence.length(); i++) {

//            System.out.println(sentence.charAt(i));

//        }

//        char[] charArray = sentence.toCharArray();

//        System.out.println("2. way");

//        for (int i = 0; i < charArray.length; i++) {

//            System.out.println(charArray[i]);

//        }

//        System.out.println("3. way");

//        for (char c : charArray) {

//            System.out.println(c);

//        }



        //part2

        // put every character in to one HashSet

//        HashSet<Character> mySet = new HashSet<>();

//        for (int i = 0; i < sentence.length(); i++) {

//            char aChar = sentence.charAt(i);

//            mySet.add(aChar);

//        }

//        System.out.println(mySet);

        //part3

        // put every character in HashMap<Character, Integer>, use value 0

        HashMap<Character, Integer> myMap = new HashMap<>();

        for (

                int i = 0; i < sentence.length(); i++) {

            char aChar = sentence.charAt(i);

            myMap.put(aChar, 0);

        }

        System.out.println(myMap);

    }

}