package day23_Practice;

public class Task6 {
    // Given an array of ints,
    // print true if it contains no 1's or it contains no 4's.

    // {1,2,3} => true
    // {2,3,4} => true
    // {1,2,4} => false
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        for (int num : arr) { // for-each loop
//            if (num == 4 || num == 1) {
//                System.out.println("true");
            int [] arr = {1, 2 , 3, 1, 5};
            for (int i : arr) {
                if (i == 1 && i != 4) {
                    System.out.println(true);
                }else if (i!= 1 && i == 4) {
                    System.out.println(true);
                }else {
                    System.out.println(false);
                }

            }
        }
//    public class Task6 {
        // Given an array of ints,
        // print true if it contains no 1's or it contains no 4's.
        // {1, 2, 3} => true
        // {2, 3, 4} => true
        // {1, 2, 4} => false
        //Hint: use boolean variable to hold state
//        public static void main(String[] args) {
//            int[] numbers = {1, 2, 4};
//            boolean haveOne = false;
//            boolean haveFour = false;
//
//            for (int number : numbers) {
//                if (number == 1) {
//                    haveOne = true;
//                } else if (number == 4) {
//                    haveFour = true;
//                }
//            }
//
//            if (haveOne && haveFour) {
//                System.out.println(false);
//            } else {
//                System.out.println(true);
            }





