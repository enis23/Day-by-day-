package day11;

public class ForEx2 {
    public static void main(String[] args) {
//        int N = 0;
//        int sum = 0;
//        for (int x = 1; x<=5; x++){
//            sum = sum+ x;
//            N++;
//            System.out.println(N);
//        }
//        System.out.println("sum is :" + (1+2+3+4+5));
//        int N = 0;
//        int sum = 0;
//
//        for (int i = 1; i <= 6; i++) {
//            sum = sum + i;
//            N++;
//        }
//
//        System.out.println("Sum is :" + sum);
//        System.out.println("Average is : " + ((double)sum/N));

int counter = 0;
int sum = 0;
for(int i = 1; i <= 10; i = i + 3) {
    System.out.println(i);
    sum += i;//same as sum = sum + i;
    counter++; //same as counter = counter + 1;
}
        System.out.println("sum from 1 to 10 with +3 is " + sum);
                System.out.println("counter is " + counter);

        System.out.println((double) sum / counter);
    }
    }
    // part 1
// write a program with sum up to you provided number from 0
// 5
// 0+1+2+3+4+5 = > ???

