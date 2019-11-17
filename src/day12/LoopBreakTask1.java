package day12;

public class LoopBreakTask1 {

    public static void main(String[] args) {
        int number = -1;
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