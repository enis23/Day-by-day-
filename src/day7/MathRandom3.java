package day7;

public class MathRandom3 {
    // int randomInRange=min + (int) (Math.random() * ((max - min) + 1));
    public static void main(String[] args) {

        int min = 0;
        int max = 5;
        int range = max - min;

        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

        if (randomInRange==1){
            System.out.println("One");
         if (randomInRange==0) ;
            System.out.println("zero");
        }
        if (randomInRange==1);
        System.out.println("one");
        if (randomInRange==2);
        System.out.println("two");
        if (randomInRange==3);
        System.out.println("three");




    }
}
