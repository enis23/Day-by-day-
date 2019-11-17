package day8;

public class ifelse2 {
    public static void main(String[] args) {
        String s1 = "Hello";

        if (s1.length() == 5) {
            System.out.println("its have enough length");
        } else if (s1.contains("o")) {
            System.out.println("it has o");
        } else {
            System.out.println("ignore this");
        }
    }
}

