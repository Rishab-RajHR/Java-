package Associativity;

public class asc {
    public static void main(String[] args) {
        int a = 6*5-34/2;  // Precedence => 30-34/2 = 30-17 = 13

        /* Highest Precendecence goes to * and /. They are then evaluated on the basis of left to right associativity */
        int b = 60/5-34*2;  //Associativity => 12-34*2 = 12-68 = -56
        System.out.println(a);
        System.out.println(b);
        // Precedence & Associativity
        a = b = 45; // right to left
    }
}
