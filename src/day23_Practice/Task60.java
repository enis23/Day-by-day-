package day23_Practice;

public class Task60 {
    // Given an array of ints,
    // print true if it contains no 1's
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        for (int i : nums) {
            if (i != 1) {
                System.out.println("i have it");
            }
        }
    }
}