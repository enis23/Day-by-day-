package day19_HashSet;

import java.util.ArrayList;

public class ArrayListTask6 { public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("White");
    colors.add("Black");
    colors.add("Green");
    System.out.println(colors);

    System.out.println("1.way");
    colors.remove(2);
    System.out.println(colors);

    System.out.println("2.way");
    colors.remove("Black");
    System.out.println(colors);

}
}
