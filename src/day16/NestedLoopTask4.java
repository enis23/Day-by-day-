package day16;

public class NestedLoopTask4 {
    //TODO Write program that prints this using loops
    // *****
    //  ****
    //   ***
    //
    //     *
    public static void main(String[] args) {
        System.out.println("HARD CODED -------------------------");
        System.out.println("*****");
        System.out.println(" ****");
        System.out.println("  ***");
        System.out.println("   ");
        System.out.println("    *");

        System.out.println("USING LOOPS ----------------------");
        for (int i = 5; i >= 0; i--) {
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }


