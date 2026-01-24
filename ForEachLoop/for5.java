// package ForEachLoop;

public class for5 {
    public static void main(String[] args) {
        int [] marks = {98, 45, 79, 99, 80};

        // Print in reverse order
        System.out.println("Printing in reverse order");
        for(int i=marks.length-1; i>=0 ; i--){
            System.out.println(marks[i]);
        }
    }
}
