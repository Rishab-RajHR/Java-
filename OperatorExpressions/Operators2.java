package OperatorExpressions;

public class Operators2 {
  
     public static void main(String[] args) {
        //  int a = 4;
        //  int b = 6 % a; // modulo operator
         int b = 9;
         b += 3;  // b *= 3;
         System.out.println(b);
         System.out.println(6==8); // comparison operator
         System.out.println(64>6);

         // Logical Operator
         System.out.println(64>5 && 64>8); // AND operator
         System.out.println(64>5 || 64>98); // OR operator

         // Bitwise Operator
         System.out.println(2&3); // 2
     }
}
