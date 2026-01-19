// package Switch;

import java.util.Scanner;

public class ranom {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();


        switch(age) {
            case 18:
               System.out.println("You are going to become an Adult!");
               break;
            case 23:
               System.out.println("You are going to join job!");
               break;
            case 68:
               System.out.println("You are going to get retired!");
               break;
            default:
               System.out.println("Enjoy Your Life!");
        }
        System.out.println("Thanks for using the Java code");
    }
}
