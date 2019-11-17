package day11;

import java.util.Scanner;

public class Whiletask1 {   // Part2, continue part1 but also check for length() of string
    // if length is bigger than 10, program should say that string is too large
    // ex:
    // in the while loop....
    //     wjherjwhejrhwejrh => "string is too large"

    public static void main(String[] args) {
//        {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Write a string");
//        String s = scan.nextLine();
//
//        while (!s.equals("o")) { //s != "exit"
//            System.out.println("Write a string");
//            s = scan.nextLine();
//            if (s.length() >= 10) {
//                System.out.println("string is too large");
//            }}
//        }
        //part 3. continue part 2, if provided string is equals to your name
        // program  should print ypur name
        {

//            Scanner scan = new Scanner(System.in);
//
//            System.out.println("Write a string");
//            String s = scan.nextLine();
//
//            while (!s.equals("quit"))  //s != "exit"
//                System.out.println("Write a string");
//            s = scan.nextLine();
//            if (s.length() >= 10)
//                System.out.println("string is too large");
//        }

            {
                Scanner scan = new Scanner(System.in);

                System.out.println("Write a string");
                String s = scan.nextLine();
                if (s.equals("Enis"))
                    System.out.println("Karabulut");
                s = scan.nextLine();
            }
        }
    }
}
