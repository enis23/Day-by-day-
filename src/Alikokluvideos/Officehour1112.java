package Alikokluvideos;

import java.util.ArrayList;

public class Officehour1112 {
    public static void main(String[] args) {

//
//        //        verify first array equal to  second array
//
//        ArrayList<String> list1 = new ArrayList<>();
//
//        list1.add("Lion");
//        list1.add("Tiger");
//        list1.add("Elephant");
//        list1.add("Cow");
//
//        ArrayList<String> list2 = new ArrayList<>();
//
//        list2.add("Lion");
//        list2.add("Tiger");
//        list2.add("Cat");
//        list2.add("Cow");
//
////        first use for loop and then use the if statement
//        boolean result = true;
//
//        for (int i = 0; i < list1.size(); i++) {
//
//            System.out.println("list 1 is here  -->>  " + list1.get(i));
//            System.out.println("list 2 is here  -->>  " + list2.get(i));
//
//            if (list1.get(i).equals(list2.get(i))) {
//
//                result = true;
//
//            } else {
//
//                result = false;
//            }
//
//        }
//
//        System.out.println("my result is --->> " + result);
        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Lion");
        list3.add("Dog");
        list3.add("Tiger");
        list3.add("Cat");
        list3.add("Lizard");
        list3.add("Elephant");
        list3.add("Cow");


        ArrayList<String> list4 = new ArrayList<>();

        list4.add("Lion");
        list4.add("Elephant");
        list4.add("Bird");
        list4.add("Tiger");
        list4.add("Zebra");
        list4.add("Lizard");
        list4.add("Dog");

//      please make sure list 3 contains list 4
        boolean check =false;
        for (int i=0;i<list3.size();i++){
        for(int j=0;j<list4.size();j++) {
            if (list3.get(i).contains(list4.get(j))){
                check=true;}
            else{
                check=false;
                break;}



        }
        System.out.println(check);
        }

    }
}