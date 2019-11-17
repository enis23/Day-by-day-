package day6;

public class javaclass4 {
    public static void main(String [] args) {
        //String Length
        String s1 = "asdasd";
        System.out.println(s1.length());

        int l = s1.length();
        System.out.println(l);
        String username = "techno.study";

        if(username.length() < 10){
            System.out.println("you can login");
        }
        if(username.length() >=10){
            System.out.println("you cannot login");
        }

        //Task 1: Write a program that sums two strings Length
        //ex: "ABC", "Z" => 3+1=>
        //output: "Length is 4"
        String a1 = "ABC";
        String a2 = "Z";
        // 1.way
        System.out.println("Length is"+ (a1+a2).length());
        //2.way
        System.out.println("Length is" + (a1.length()+a2.length()));
        //3.way
        int lengthA1 = a1.length();
        int lengthA2 = a2.length();
        int sum = lengthA1 + lengthA2;
        System.out.println("Length is " + sum);

        String c1 = "short";
        String c2 = "loooooong";

        int lengthC1 = c1.length();
        int lengthC2 = c2.length();
        int subtraction = lengthC1 - lengthC2;

        //assume that subtraction =4
        if(subtraction < 0) { //4 < 0
            System.out.println("can not proceed");
        }else { // 4 >=0
            System.out.println("we can do it");
        }

    }

}
