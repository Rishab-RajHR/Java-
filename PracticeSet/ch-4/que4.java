import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter website URL: ");
        String website = sc.next();

        if (website.endsWith(".org")) {
            System.out.println("This is an organisational website");
        } 
        else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } 
        else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        } 
        else {
            System.out.println("Unknown website type");
        }

        sc.close();
    }
}
