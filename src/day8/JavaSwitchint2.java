package day8;

import java.util.Scanner;

//1->Monday
//7=>Sunday
public class JavaSwitchint2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayofweek = scanner.nextInt();
        switch (dayofweek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("number is not supported");
                break;
        }
    }
}
