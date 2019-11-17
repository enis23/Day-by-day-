package day22_Practice;

public class Task11 {
    // write a java program that print array in this manner
    // using while loop
    // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    //output:
    //  1 10
    //  2 9
    //  3 8
    //  4 7
    //  5 6
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int first=0;
      int second=9;
        while(first<10){
            System.out.println(intArray[first] + " " + intArray[second]);
            first++;
                  second--;
      }
    }
}