package day5;



public class TestwithPackages {

    public static void main(String[] args) {



        double a = 9;

        a++;

        a--;



        a += 3;

        a -= 10;

        a *= 2;

        a /= 4 ;





        char aChar = '2';

        char A = 'A';

        char B = 'A' + 1;

        System.out.println(A);

        System.out.println(B);





        String courseName = "techno study";

        System.out.println(courseName);



        String printA = "letter is: " + A;

        System.out.println(printA);



        //techno study

        char c = courseName.charAt(2);

        String myVar = "tey";



        boolean name = courseName.startsWith("tey");

        boolean dy = courseName.endsWith("dy");



        boolean no = courseName.contains("no");





        int num1 = 45;

        int num2 = 899;



        TestComparingOperators(num1, num2);

        Add(num1, num2);

        Multiply(num1, num2);

        Deduct(num1, num2);

    }



    private static void Add(int num1, int num2) {



        System.out.println(num1 + num2);

    }



    private static void Deduct(int num1, int num2) {



        System.out.println(num1 - num2);

    }



    private static void Multiply(int num1, int num2) {

        System.out.println(num1 * num2);

    }



    static void TestComparingOperators(int number1, int number2) {

        // * Comparing operators: ==, !=, <, <=, >, >=

        // = means assign number1 (34) = number2 (34)

        // == means equality number1 == number2 (34)

        // != means not equal number1 != number2 (34)

//        Comparing operators: ==, !=, <, <=, >, >=

        if (number1 == number2) {

            System.out.println("Numbers are equal");

            System.out.println("Numbers are equal");

        } else {

            System.out.println("Numbers are NOT equal");

            System.out.println("Numbers are NOT equal");

        }





//

//        if (number1 == number2) {

//            System.out.println("Numbers are equal");

//        } else {

//            System.out.println("Numbers are NOT equal");

//        }



    }

}