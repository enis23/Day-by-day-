package day6;

public class stringTrim {
    public static void main(String[] args) {
        String string = "   Hello       ";
        System.out.println(string);
        System.out.println(string.trim());

        String s2 = "   Hello  World     ";
        System.out.println(s2.trim());
    }
}