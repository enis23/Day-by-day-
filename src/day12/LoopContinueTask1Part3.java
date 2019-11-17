package day12;

public class LoopContinueTask1Part3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(">>>>>>>>> " + i);
            if(i >= 4){
                continue;
            }
            System.out.println("<<<<<<<<< " + i);
            System.out.println();
        }
    }
}