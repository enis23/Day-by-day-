package day16;

public class MultiDimensionalArraysTask1 {
    // Create 2D array
    // in first row put names
    // in second row put surnames
    // Hint:
    // String[][] namesAndSurnames

    //part2. print them name and surname, without loop
    //ex:  { {Bayram}, {Guney} } => Bayram Guney
    public static void main(String[] args) {
        //part1
        String[][] s = {
                //   0         1         2           3            4
                {"Bayram", "Zeynep", "Sezai", "Micheal", "Baraka"}, //0. row
                {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},   //1. row
        };

        //part2
        System.out.println(s[0][0] + " " + s[1][0]);
        System.out.println(s[0][1] + " " + s[1][1]);
        System.out.println(s[0][2] + " " + s[1][2]);
        System.out.println(s[0][3] + " " + s[1][3]);
    //part 3
        //using only one loop print names and surnames
        // ex.
        //Bayram Guney
        //Michael Jackson
        System.out.println("part3---------------------------");
        System.out.println("columns at row 0: " + s[0].length);
        for (int i=0;i<s[0].length; i++){
            System.out.println(s[0][i]+" "+s[1][i]);
        }
    }
}
