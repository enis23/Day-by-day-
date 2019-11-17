package day22_Practice;

public class Task10 {
    //write a java program that iterates in reverse order on
    // an array using while-loop
    public static void main(String[] args) {
        int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};
      int i= intArray.length-1;

              int c=0;
      while(i>=0){
          System.out.println(intArray[i] + " " + intArray[c]);
          i--;
        }

        }

        // ex. output:
        // 10 9 8 7 6 5 4 2 100
    }

