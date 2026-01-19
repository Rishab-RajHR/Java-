import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
       // We can't put assignment in if Statement it will throw an error
      //  int a = 11;
      //  if(a=11){

      //  }

      // Question 2
      // Student pass or fail in 3 subjects

      byte m1, m2, m3;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your marks in Physics");
      m1 = sc.nextByte();

      System.out.println("Enter your marks in Chemistry");
      m2 = sc.nextByte();

      System.out.println("Enter your marks in Mathematics");
      m3 = sc.nextByte();

      float avg = (m1+m2+m3)/3.0f;
      System.out.println("Overall percentage is: " + avg);
      if(avg >= 40 && m1>=33 && m2>=33 && m3>=33){
          System.out.println("Congratulations, You have been promoted");
      }
      else{
          System.out.println("Sorry, You have not been promoted");
      }


    }
}
