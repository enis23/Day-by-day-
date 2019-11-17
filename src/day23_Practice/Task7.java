package day23_Practice;

import java.util.ArrayList;

public class Task7 {
    // Given arrayList of chars
    // print true if they have repetitive letters
    // {'A','B','B'} => true
    // {'C','D'} => false
    public static void main(String[] args) {
        ArrayList<Character>alist=new ArrayList<>();
         alist.add('A');
         alist.add('B');
         alist.add('B');

         int count=0;
         boolean rep=false;
        for (int i = 0; i <alist.size() ; i++) {
            for (int j = i+1;j<alist.size(); j++) {
                if (alist.get(i)==alist.get(j)&&i!=j){

                    rep=true;
                }
                
            }
            if (rep){
                System.out.println("repetitive number"+true);
            }else{
                System.out.println("nothing");
            }
        }
    }
}
//public class Task7 {
//    // Given arrayList of chars
//    // print true if they have repetitive letters
//    // {'A','B','B'} => true
//    // {'C','D'} => false
//    public static void main(String[] args) {
//        ArrayList<Character> letterList = new ArrayList<>();
//        letterList.add('C');
////        letterList.add('D');
////        letterList.add('e');
////        letterList.add('D');
////        letterList.add('B');
//
//        // 1way. sets
//        HashSet<Character> letterSet = new HashSet<>();
//        for (Character letter : letterList) {
//            letterSet.add(letter);
//        }
//
//        System.out.println(letterList);
//        System.out.println(letterSet);
//        if(letterList.size() == letterSet.size()){
//            System.out.println("we dont have repetition: " + false);
//        }else {
//            System.out.println("we have repetition: " + true);
//        }
//
//        // 2way. nested loop
//        // 3way. indexes
//    }
//
//}