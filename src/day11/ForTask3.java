package day11;

import java.util.Scanner;

public class ForTask3
// part 1
// write a program with sum up to you provided number from 0
// 5
// 0+1+2+3+4+5 = > ???
{
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Provide a max number ");
        int max = s.nextInt();

        int sum = 0;
        int numbersInLoop= 0;
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
            sum += i;// sum=sum+i

            numbersInLoop++;
        }
        System.out.println("sum is" + sum);
        System.out.println("average is" + ((double)sum)/numbersInLoop);
    }
}