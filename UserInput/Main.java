import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        // String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("Enter number 2");
        // int b = sc.nextInt();
         float b = sc.nextFloat();
        float sum = a + b;
         System.out.println("The sum of these numbers is");
         System.out.println(sum);
    }
}
