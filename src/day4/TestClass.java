package day4;

public class TestClass {
    public static void main(String[] args) {
        int n1 = 45;
        int n2 = 899;

        // if you type (int num1)instead of( int number)
        // TestComparingOperators(n1, n2);
        callAdd(n1, n2);
        callMultiply(n1, n2);
    }

    private static void callMultiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    private static void callAdd(int n1, int n2) {
        System.out.println(n1 + n2);


        int a = 9;
        //       a=a+1; //a++; same thing.
        a++;//after this line it will be? 9+1 = 10;
        // a +=3; // 10+3 =13;
        a -= 10; // 13-10=3;
        a *= 2;//3*2=6;
        a /= 4;// 6 /4  =?????, why does equal 1.
    }

}
