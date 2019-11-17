package day23_Practice;

public class Task63 {
    // Given an array of ints,
    // print "true" outside of loop, if it does not contains 4
    // {4, 1, 1} => false
    // {1, 2, 3} => true
    // DON'T USE BREAK
    // Hint: use boolean variable to hold state
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean havefour = false;
        // write your code here
        for (int number : numbers) {
            if (number == 4) {
                havefour = true;
            }
            // end of your code
        }
        if (havefour) {
            System.out.println("false");
        } else {
            System.out.println("true");

//        }int[] numbers = {1, 2, 1, 4, 5};
//        boolean noFour = false;
////
//        for (int number : numbers) {
//            if (number == 4) {
//                noFour = true;
//            }
////
//            if (noFour) {
//                System.out.println("No more trouble with four... ");
        }
    }
}