package day15;

public class ArrayTask5 {
    //TODO
    // Given 2 arrays of ints, a and b,
    // part1. if they have the same first element print => "have the same first elements"
    // part2. if they have the same last element print => "have the same last elements"
    // part3. if they have the same middle element print => "have the same middle elements"

    public static void main(String[] args) {
        //HINT:
        //create two arrays, fill it with numbers
        //check numbers at index 0
        int[] a = {10, 20, 25, 55};
        int[] b = {10, 60, 30, 23, 99, 100};

        //part 1
        if (a[0] == b[0]) {
            System.out.println("have the same first elements");
        }
        //part 2
        int lengthOfA = a.length; //5
        int lengthOfB = b.length; //3
        if(a[lengthOfA-1] == b[lengthOfB-1]){ // a[5]
            System.out.println("have the same last elements");
        }
        //part 3
        System.out.println("Part3------------------------");
        if (a[lengthOfA / 2] == b[lengthOfB / 2]) {
            System.out.println("have the same middle elements");
        }

        // part4. check every element, if they are same print => "arrays are same"

        //ex:

        // a = {5, 6, 7}

        // b = {5, 6, 7}

        // => "arrays are same"

        //ex2:

        // a = {3, 2, 6}

        // b = {5, 6, 7}

        // => "arrays are different"

        System.out.println("Part4------------------------");
        // part4. check every element, if they are same print => "arrays are same"
        //ex:
        // a = {5, 6, 7}
        // b = {5, 6, 7}
        // => "arrays are same"
        //ex2:
        // a = {3, 2, 6}
        // b = {5, 6, 7}
        // => "arrays are different"
        int[] arrayA = {5, 8, 7};
        int[] arrayB = {5, 8, 7};
// way 1
//        boolean areEqual = false;
//        for(int i = 0; i < a1.length; i++){
//            if(a1[i] == b1[i]){
//                areEqual = true;
//            }else {
//                areEqual = false;
//                break;
//            }
//        }
//        int[] a1 =  {5, 8, 7};
//        int[] b1 =  {5, 6, 7};
        boolean isEqual = true;
        for (int i = 0; i < arrayA.length; i++) {
            // 1. 5 != 5 => false
            // 2. 8 != 6 => true
            if (arrayA[i] != arrayB[i]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual == true) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }
    }
}