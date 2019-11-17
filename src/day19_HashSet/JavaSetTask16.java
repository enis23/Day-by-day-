//package day19_HashSet;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Random;
//public class JavaSetTask16 {
//    //16. you have list of numbers, determine if you have duplication there
//    //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
//    //ex2: [1, 2, 3] => no duplications
//    public static void main(String[] args) {
//        Random rand = new Random();
//
//        HashSet<Integer> mySet = new HashSet<>();
//        ArrayList<Integer> myList = new ArrayList<>();
//        for (int i=1;i<=10;i++){
//            int randomNumber = rand.nextInt(5); // 0 1 2 3 4
//
//            mySet.add(randomNumber);
//            myList.add(randomNumber);
//        }
//
//            System.out.println("myList: " + myList);
//            System.out.println("mySet: " + mySet);
//        }
//    }

package day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaSetTask16 {
    //16. You have list of numbers, determine if you have duplication there
    //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
    //ex2: [1, 2, 3] => no duplications
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        list.add(4);
//        list.add(4);
//        list.add(5);
//        list.add(6);

        System.out.println(list + " size:" + list.size());

        HashSet<Integer> mySet = new HashSet<>(list);
        System.out.println(mySet + " size:" + mySet.size());

        if (list.size() != mySet.size()) {
            System.out.println("has duplications");
        } else {
            System.out.println("no duplications");
        }

    }
}