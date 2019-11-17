package day16;

public class NestedLoopTask2 {
    //using loop print multiplication table of 1
    // part1:
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10

    // part1.1 continue part1, but use multiplication(*) and 2 variables,
    //  a = 1; b = 1;
    //  result = a * b;
    // print => a + "*" + b + "=" + result;

    //part1.3 print multiplication of table 1,2,3,4,5,6,7,8,9,10
    public static void main(String[] args) {


//        for (int i = 1; i <= 10; i++)
//        {
//            System.out.println("1" + "x" + i + " =" + i); {
//
//        }
//
//        }

        // part1.1 continue part1, but use multiplication(*) and 2 variables,
        //  a = 1; b = 1;
        //  result = a * b;
        // print => a + "*" + b + "=" + result;

        //part1.3 print multiplication of table 1,2,3,4,5,6,7,8,9,10
        //part1.1------
//        int a = 2;
//            for (int b = 1; b <= 10; b++) {
//                System.out.println(a + " x " + b + " = " + (a * b));
//            }
        //part1.3------
//        for (int a = 1; a<=10;a++)
//            for (int b = 1; b <= 10; b++) {
//               System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println("PART2-------------------------------");
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println(a + " + " + b + " = " + (a + b));
            }
            System.out.println();
        }
    }
}


