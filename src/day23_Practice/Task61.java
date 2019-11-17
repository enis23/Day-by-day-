package day23_Practice;

public class Task61 {
    // Given an array of ints,
    // print true if it contains no 4's
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }
}