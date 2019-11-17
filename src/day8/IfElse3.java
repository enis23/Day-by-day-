package day8;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int number = scan.nextInt();

        if(number>0){
            System.out.println("number is bigger than zero");
        }else if (number<0) {
            System.out.println("number is less than zero");
        }else{
            System.out.println("number is zero");

        }
    }
}
