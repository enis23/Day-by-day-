package day26_JavaExceptionTest;

public class JavaExceptionTest {
    public static void main0(String[] args) {
        throw new ArithmeticException();
    }

////Options: Answer is 1.
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion


//    static ArithmeticException ae = new ArithmeticException();
//
//    public static void main1(String[] args) {
//
//        throw ae;
//    }
////Options: Answer 1.
////1. RuntineException:java.lang.ArithmeticExcetion
////2. RuntineException:/ by zero
////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
////4. RuntineException:ArithmeticExcetion
//
//
//    static ArithmeticException ae;
//    public static void main(String[] args)
//    {
//        throw ae;
//    }
//Options:
//1. RuntineException:java.lang.ArithmeticExcetion
//2. RuntineException:NullPointerException
//3. No Output
//4. RuntineException:ArithmeticExcetion


//    public static void main(String[] args)
//    {
//        throw new ArithmeticException("/ by zero");
//        System.out.println("Hello TECHNO");
//    }
////Options:Answer is:2.
////1. Run-time Exception
////2. Compile-time error
////3. No Output
////4. Compile-time Exception

    //    public static void main(String[] args)
//    {
//        throw new TECHNO();
//        System.out.println("Hello TECHNO");
//    }
////Options: Answer 4.
////1. Hello TECHNO
////2. No Output
////3. Run-time Exception
////4. Compile-time error
////
//    public static void main(String[] args) throws ArithmeticException {
//        System.out.println(10 / 0);
//        System.out.println("Hello TECHNO");
//    }

//
////Options: Answer 3.
////1. Hello TECHNO
////2. No Output
////3. Run-time Exception
////4. Compile time error
//

    static class Test {
        void m1() throws ArithmeticException {
            throw new ArithmeticException("Calculation error");
        }

        void m2() throws ArithmeticException {
            m1();
        }

        void m3() {
            try {
                m2();
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
        }

        public static void main(String args[]) {
            Test t = new Test();
            t.m3();
            System.out.println("Handled by TECHNO");
        }
    }
////Options:
////1. Calculation error
////2. ArithmeticException
////3. Handled by TECHNO
////4. ArithmeticException Handled by TECHNO
//

//    class Test {
//        void method1() throws ArithmeticException {
//            throw new ArithmeticException("Calculation error");
//        }
//
//        void method2() throws ArithmeticException {
//            method1();
//        }
//
//        void method3() {
//            try {
//                method2();
//            } catch (ArithmeticException e) {
//                System.out.println("ArithmeticException");
//                System.out.println(e.getMessage());
//            }
//        }
//
//        public static void main(String args[]) {
//            Test t = new Test();
//            t.method3();
//            System.out.println("Handled by TECHNO");
//        }
//    }
}