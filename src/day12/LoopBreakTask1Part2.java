package day12;
import java.util.Random;
public class LoopBreakTask1Part2 {
    public static void main(String[] args) {
        int number = -1;

        Random rand = new Random();
        int someRandomNumber = rand.nextInt(100000000);
        int someRandomNumber1 = (int)(Math.random() * 100000000);
        for (int i = 0; i <= 100000000; i++) {
            System.out.println(i);
            if (i == 232558) {
                System.out.println("----------------");
                number = i;
                break;
            }
        }
        System.out.println("Your number is " + number);
    }
}

