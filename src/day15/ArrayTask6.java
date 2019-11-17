package day15;

public class ArrayTask6 {
    public static void main(String[] args) {
        String[] stringNumbers=new String[15];
        for (int i=0;i< stringNumbers.length;i++){
        stringNumbers[i]="" +i;
    }
        String stringSum="";
        for(String s: stringNumbers) {
            stringSum += s + "";
        }
        System.out.println("StringConcatenate : " + stringSum);



        int[] intArray = new int[15];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(stringNumbers[i]);
        }

        int intSum = 0;
        for (int n : intArray) {
            intSum += n;
        }
        System.out.println("IntSum: " + intSum);

    }
}