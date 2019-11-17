package day6;

public class StringSubstrings {

    //Substrings
    public static void main(String[] args) {
        //012345678910
        String string1 = "Hello World";
        System.out.println(string1.substring(6)); // World

        System.out.println(string1.substring(0,1)); // H
        System.out.println(string1.substring(6,7)); // W

        System.out.println(string1.substring(11,11));//
        System.out.println(string1.substring(0));//Hello World
    //Task1:
    //write a program that prints your initials
    // ex: Michale Jackson => MJ
            //01234567891011121314
            String name = "Enis Karabulut";
            String a=name.substring(0,1);
            String b=name.substring(5,6);
            System.out.println(name.substring(0,1)+name.substring(5,6));
            String dot=".";
        System.out.println(a+dot+b+dot);
}
}
