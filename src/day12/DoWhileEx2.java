package day12;
import java.util.Scanner;
public class DoWhileEx2 {
    public static void main(String[] args) {
        // day32.task 1, check pin, pin should be 4 digit number
        // if it is not 4 digit number, print "incorrect pin"
        // hint: 999 < PIN < 10000
        // ex: 13123 => "incorrect pin"

            Scanner scan = new Scanner(System.in);

            String pin;
            do {
                System.out.println("please write pin");
                pin = scan.nextLine();
                if((!(pin.length() ==4))){
                    System.out.println("incorrect pin");

                }

                //write you code here

            } while(!pin.equals(9999));

            System.out.println("take your card, please");
        }
    }

