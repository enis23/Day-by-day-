package officehours;
// * reverse method reverse a string.
//    it gets a string and returns it in reverse.
//
//for day32.example:
//
//    reverse("foo") ==> "oof"
//
//    reverse("student") ==> "tneduts"
//            */
    public class ReverseString {
        public static String reverse(String input)  // String - int- void - char - int[]- Int
        {
            String reversed = ""; //null degil
            for(int i= 0; i < input.length(); i++){
                reversed += input.charAt(input.length()-1-i);

                //input = sena => 4  reversed = ""
                //i = 0   4-1 - 0 input.charAt(3)  reversed = "a"
                //i = 1   4-1 - 1 input.charAt(2)  reversed = "an"
                //i = 2   4-1 - 2 input.charAt(1)  reversed = "ane"
                //i = 3   4-1 - 3 input.charAt(0)  reversed = "anes"

            }
            return reversed;
        }

        public static String multiplyA(int input) {

            String Akutusu = "";

            for(int i = 0; i<input; i++) {
                Akutusu += "A";
            }
            return Akutusu;
        }

        public static void main(String[] args) {

            System.out.println(multiplyA(7));

            ReverseString myString = new ReverseString();
            System.out.println(myString.reverse("sena"));


            System.out.println(reverse("Herkese Merhaba"));


        }
    }

