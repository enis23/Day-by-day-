package day7;

public class MathRandom {
    public static void main(String[] args) {
        //Random numbers
        double enis = Math.random(); // 0 <-> 1
        System.out.println(enis);// to print random

        System.out.println("------------------");

      int max= 10; // 0-100
        double r1 = enis * max; // 0-10
        int i1 = (int) r1;
        System.out.println(r1);
        System.out.println(i1);

        System.out.println("---------------------");
        //TODO day32.task 1: print randomn integer number between 0 and 100
        int max2= 100;// declaring integer max with value
        double r2 = enis * max2; // gets random double between 0-"max"
        int i2=(int)r2; // gets integer form double
        System.out.println(r2); //printing double r1
        System.out.println(i2); // printing integer i1

        System.out.println((int)(Math.random()*100));

    }
}
