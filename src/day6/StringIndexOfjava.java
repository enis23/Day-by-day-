package day6;

public class StringIndexOfjava {
    // Searching in Strings With indexOf()
    public static void main(String[] args) {

        System.out.println("EX 1---------------------------");
        //01234
        String s1 = "Hello";
        System.out.println(s1.indexOf("e"));

        System.out.println("EX 2---------------------------");
        //indexOf get first occurrence of your searching string
        String s2 = "Techno Study";
        int indexS2 = s2.indexOf("ech");
        System.out.println(indexS2);

        System.out.println("EX 3---------------------------");
        //lastIndexOf get last occurrence of your searching string
        String s3 = "so something so many";
        int indexS3 = s3.lastIndexOf("so");
        System.out.println(indexS3);

        System.out.println("TASK 1---------------------------");
        //Task 1: write code that count length of string and prints sum of length and index of "e"
        //    ex: "techno" => 6+1 => 7
        //    hint: length(), indexOf()
        //01234567
        String str = "techenoe";
        int length = str.length(); // 8
        int index = str.lastIndexOf("e"); // 7

        int sum = length + index; // 8 + 7
        System.out.println(sum); // 15
    }

}