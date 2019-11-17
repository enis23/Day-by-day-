package day14;

public class ArrayForLoops {
    public static void main(String[] args) {
        int[] xyz = {2, 11, 45, 9, 56};
        int min = xyz[5];
        for (int i = 0; i < xyz.length; i++) {

            //System.out.println(xyz[i]);

            if (xyz[i] < min)
                min = xyz[i];
            System.out.println(xyz[i]);

        }
    }
}

