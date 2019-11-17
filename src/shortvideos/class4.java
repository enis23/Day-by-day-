package shortvideos;

import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total3=0;
        for (int i=1;i<4;i++) {
            System.out.println("Please enter your positive number");
           int num = scan.nextInt();
           total3=total3+num;
            System.out.println(total3);
        }
    }
}
