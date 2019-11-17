package day8;

import java.util.Scanner;

public class ifelse7 {public static void main(String[] args) {
    //evaluate result of exam
    //'A' => excellent
    // 'B'=>good
    // 'C'=> middle
    // 'D'=> pass
    // ' F'=> fail
    Scanner scan = new Scanner(System.in);

    System.out.println("Provide a grade:");
    String grade = scan.nextLine();

    if (grade.equals("A")) {
        System.out.println("excellent");
    } else if ("B-".equals(grade) ||"B".equals(grade)||"B+".equals(grade)) {
        System.out.println("good");

    } else if ("C".equals(grade)||"C-".equals(grade)|| "C+".equals(grade)){
        System.out.println("middle");
    } else if ("D".equals(grade)||"D-".equals(grade)||"D+".equals(grade)) {
        System.out.println("pass");
    } else if ("F".equals(grade)) {
        System.out.println("fail");
    }
}
}

