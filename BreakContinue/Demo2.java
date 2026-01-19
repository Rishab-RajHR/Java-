// package BreakContinue;

public class Demo2 {
     public static void main(String[] args) {
         int i = 0;
         while(i<5) {
        System.out.println(i);
          System.out.println("Java is great");
         if (i == 2) {
            System.out.println("Ending the loop");
            break;
         }
         i++;
    }

    System.out.println("loop endss here");
     }
}
