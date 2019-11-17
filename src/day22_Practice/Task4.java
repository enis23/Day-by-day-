package day22_Practice;

public class Task4 {
    // 4. Write a Java program to test if an array contains a specific value
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 45, 34, 645, 6, 45};
        for (int num : arr) { // for-each loop
            if (num == 6) {
                System.out.println("I have it");
            }
        }
    }
}