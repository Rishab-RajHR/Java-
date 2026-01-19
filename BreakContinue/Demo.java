public class Demo {
    public static void main(String[] args) {
        // Break and continue statements using loops
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2) {
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("Loops end here");
    }
}
