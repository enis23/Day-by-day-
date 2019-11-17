package day2;

public class IfStatement {


        public static void main(String[] args) {

//        boolean statement = false;

//        if(statement){

//            System.out.println("statement is true");

//        }

//

//        int year = 2000;

//        if(year >= 2000){

//            System.out.println("It's 20th century");

//        }

//        if(year == 2000){

//            System.out.println("It's millennium");

//        }

//        if(year < 2000){

//            System.out.println("It's 19th century");

//        }



//        // write this, and practice with if statements

//        //change temperature, change output strings

//        int temperature = 100;

//

//        if(temperature == 100) {

//            System.out.println("Frying");

//        }

//        temperature = 10;

//        if(temperature >= 70){

//            System.out.println("Its hot");

//        }

//        if(temperature < 70 && temperature >= 60){

//            System.out.println("Its warm");

//        }

//        if(temperature < 20){

//            System.out.println("Freezing");

//        }

//        if(temperature < 60 && temperature >= 20){

//            System.out.println("Cool");

//        }



            // 1. write a program that checks whether number

            //      is positive or negative

            // ex: 1 => positive

            // ex: -100 => negative

            // hint: N > 0 => positive, N < 0 => negative

            int number = 12312;

            if(number > 0){

                System.out.println("its positive");

            }

            if(number < 0){

                System.out.println("its negative");

            }

            if(number == 0){

                System.out.println("not positive neither negative");

            }



            // 2. write a program that check whether number

            //      is even or odd

            // ex: 2 => even

            // ex: 3 => odd

            int num = 3;

            if(num % 2 == 0){

                System.out.println("Even");

            }

            if(num % 2 != 0){

                System.out.println("Odd");

            }



            if(3 != 10){

                System.out.println("3 not equal to 10");

            }

















        }



        /**

         *   int a1 = 100;

         *         int a2 = 2;

         *         int a3 = 3;

         *         int result = 0; // 0

         *         if(result < a1){ // 0 < 100

         *             result = a1; // 100

         *         }

         *         if(result < a2){ // 100 < 2

         *             result = a2; //

         *         }

         *         if(result < a3){ // 100 < 3

         *             result = a3; //

         *         }

         *         System.out.println("The result number is: " + result);

         */

    }

