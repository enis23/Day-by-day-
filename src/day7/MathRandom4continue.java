package day7;

public class MathRandom4continue {

    public static void main(String[] args) {

        //task3
        int min = 10;
        int max = 20;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));

        int x = randomInRange;
        System.out.println(x);
        if ((x % 2) == 0) {
            // even
            System.out.println("even");
        } else {
            // odd
            System.out.println("odd");
        }
    }

}

        // Task 4. write a program that sums 2 random integer numbers,
        // ex: a = 10, b = 20
        //     a + b = ???;


