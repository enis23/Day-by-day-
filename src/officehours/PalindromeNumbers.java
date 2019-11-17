package officehours;

/*
 * You need to check if given Integer is palindrome or not. An integer is called palindrome if its equal to its reverse e.g. 1001 is a palindrome but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. You can use divide by 10 to reduce the number and modulus 10 to get the last digit. This trick is used to solve this problem.
While solving this assignment please don't convert the integer to string.

Examples:

   boolean b = NumbersUtil.isPalindrome(1331);
   System.out.println(b); //true

    boolean b2 = NumbersUtil.isPalindrome(1234);
    System.out.println(b2); //false
 */
    public class PalindromeNumbers {


        public static boolean isPalindrome(int number) {
            // Write your code here.
            String s = String.valueOf(number);
            // number = 13531  s = 13531
            boolean palindrome = true;
            for (int i = 0; i < s.length(); i++) {
                //i = 0 s.charAt(0) = 1   s.charAt( 5 - 1 - 0) = 1
                //i = 1 s.charAt(1) = 3   s.charAt( 5 - 1 - 1) = 3
                //i = 1 s.charAt(2) = 5   s.charAt( 5 - 1 - 2) = 5
                //i = 2 s.charAt(3) = 3   s.charAt( 5 - 1 - 3) = 3
                //i = 3 s.charAt(4) = 1   s.charAt( 5 - 1 - 4) = 1
                if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
                    palindrome = false;
                    break;
                }
            }
            return palindrome;
        }


        public static boolean isPalindrome2(int number) {
            // Write your code here.
            String s = String.valueOf(number);
            String reversed = "";
            // number = 1331  s = 1331
            boolean palindrome = true;
            for (int i = 0; i < s.length(); i++) {
                //i = 0 s.charAt(0) = 1   s.charAt( 4 - 1 - 0) = 1
                //i = 1 s.charAt(1) = 3   s.charAt( 4 - 1 - 1) = 3
                //i = 2 s.charAt(2) = 3   s.charAt( 4 - 1 - 2) = 3
                //i = 3 s.charAt(3) = 1   s.charAt( 4 - 1 - 3) = 1

                reversed += s.charAt(s.length()-1-i);
            }

            if(!s.equals(reversed)) {
                palindrome = false;
            }
            return palindrome;
        }


        public static void main(String[] args) {
            boolean b = PalindromeNumbers.isPalindrome(1331);
            System.out.println(b); // true

            boolean b2 = PalindromeNumbers.isPalindrome(1234);
            System.out.println(b2); // false

            boolean ders = PalindromeNumbers.isPalindrome2(12344321);
            System.out.println(ders); // true

            boolean ders2 = isPalindrome2(44455441);
            System.out.println(ders2); // false

        }
    }

