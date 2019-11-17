package day12;

public class LoopContinue {
        public static void main(String[] args) {
            int number = 0;
            for (int i = 1; i <= 10; i++) {
                if (i == 5) {
                    continue; // start from beginning
                }
                System.out.println("Loop iteration: " + i);
            }
            System.out.println("Your number is " + number);
        }
    }

