// package PracticeSet.ch-5;

public class Que2 {
    // sum first even number using while loop
    public static void main(String[] args) {
        int sum = 0;
        int n = 3;
        for(int i=0; i<n; i++) {
           sum = sum + (2*i);
        }
        System.out.println("Sum of even  numbers is: ");
        System.out.println(sum);
    }
}
