// package PracticeSet.ch-5;

public class Que5 {
    public static void main(String[] args) {
        // Repeat 5 using while loop
        int n = 5;
        // n = n* n-1 * n-2 * .....
        // 5 = 5*4*3*2*1
        int i = 1;
        int factorial = 1;
        while(i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
