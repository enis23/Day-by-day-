package day23_Practice;

public class Task5 {
    // Write a Java program to find the second largest element in an array.
    // {1, 34, 66, 1000, 23, 4, 7, 9} => 66
    public static void main(String[] args) {
//     1.way
//        int arr[] = {1, 34, 66, 1000, 23, 4, 7, 9};
//        int largest = arr[0];
//        int secondLargest = arr[0];
//
//        System.out.println("The given array is:" );
//        for (int value : arr) {
//            System.out.print(value + "\t");
//        }
//        for (int value : arr) {
//
//            if (value > largest) {
//                secondLargest = largest;
//                largest = value;
//
//            } else if (value > secondLargest) {
//                secondLargest = value;
//
//            }
//        }
//
//        System.out.println("\nSecond largest number is:" + secondLargest);
//    }
//
        int[] nums = {1, 1000, 34, 66};

// 2.way
//          Arrays.sort(nums);
//        System.out.println("second largest "+ nums[nums.length-2]);
//3rd way
        int maxFirst = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = num;
            } else if (num > maxSecond) {
                maxSecond = num;
            }
        }
        System.out.println("Max:" + maxFirst);
        System.out.println("Max2:" + maxSecond);

    }}