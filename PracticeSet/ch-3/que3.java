// package PracticeSet.ch-3;

public class que3 {
    public static void main(String[] args) {
        // fill template literal 
       // <|name|> for replacement
       String letter = "Dear <|name|>, Thanks a lot!";
       letter = letter.replace("<|name|>", "Alex");
       System.out.println(letter);
    }
}
