package day12;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);

        Scanner scan = new Scanner(System.in);
        int myNumber = -1;

        while (myNumber != randomNumber){
            System.out.println("Provide a number");
            myNumber = scan.nextInt();
        }

        System.out.println("you win the game");
        System.out.println("number was " + randomNumber);



    }
}