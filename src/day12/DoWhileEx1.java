package day12;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int pin=0;
//        do{
//            System.out.println("WRITE YOUR PIN");
//            pin=scan.nextInt();
//        }while(pin !=9999);
//
//
//        System.out.println("Take your card");

        Scanner scan = new Scanner(System.in);

        int pin = 0;
        do {
            System.out.println("WRITE YOUR PIN");
            pin = scan.nextInt();
            //day32.task 1, check pin, pin should be 4 digit number
            // if it is not 4 digit number, print "incorrect pin"
            // hint: 999 < PIN < 10000
            // ex: 13123 => "incorrect pin"
            if ((pin < 999) || (pin > 10000)) {
                System.out.println("incorrect pin");

            }
        } while (pin != 9999) ;


            System.out.println("Take your card");


        }
    }

