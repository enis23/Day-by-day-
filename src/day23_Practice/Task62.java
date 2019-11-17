package day23_Practice;

public class Task62 {
    // Given an array of ints,
    // print "I have one" outside of loop, if it contains 1's
    // so if you have multiple 1's if should print "I have one" only once
    // {1, 1, 1} =>  "I have one"
    // DON'T USE BREAK
    // Hint: use boolean variable to hold state
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean haveOne = false;
        // write your code here
        for (int number : numbers) {
            if (number == 1) {
                haveOne = true;
            }
            if (haveOne) // end of your code
                System.out.println("I have one");
        }

            }}

/*//            public static void main(String[] args) {
//                int [] arr = { 1, 2, 3, 4, 5, 6, 7};
//
//                boolean haveOne = false;
//                boolean haveFour = false;
//
//                for (int i : arr) {
//                    if ( i == 1 || i ==4){
//                        haveOne = true;
//                        haveFour = true;
//                    }
//                }
//                if(haveOne && haveFour) {
//                    System.out.println(false);
//
//                }else {
//                    System.out.println(true);
//                }
        }
    }
}*/
