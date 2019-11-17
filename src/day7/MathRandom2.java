package day7;

public class MathRandom2 {
    //task2: print 2 random numbers between 0 and 10;
    //ex:4
    // 5

    public static void main(String[] args) {
       int max=10;
        double  r1 = Math.random() ; // 0 <-> 1
        Double d1= Math.random();
        System.out.println(r1);
        System.out.println(r1*10);
        int i1=(int)r1;
        System.out.println((int)(Math.random()*10));
        System.out.println(i1);
        System.out.println(d1);

    }
}
