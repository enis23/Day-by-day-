package day7;
public class JavaClass3 {

       public static void main(String[] args){
       // Concatenating Strings
           String s1 = "Hello ";
           String s2 = "World !!!";
           String a3 = "YES!!";
           System.out.println(s1+s2);
           System.out.println(s1.concat(s2).concat(a3));
           //s1 + s2 + a3

              //Task1: use separate variable for each word print it in one line
              // using concatenation
              // ex: "What","is","your","name","?" => "What is your name?"
              //Hint: you can also add extra variable with space+> String s + " ";
           String s4 = "What";
           String s5 = "is";
           String s6 = "your";
           String s7 = "name";
           String s8 = "?";
           String space = " ";
           System.out.println(s4 + space + s5 + space + s6 + space + s7 + space + s8);

           //Task2: continue day32.task 1, but print each word in new line using only
           //          one System.out.println()


       }
}
