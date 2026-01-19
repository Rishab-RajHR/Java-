// package StringMethod;

public class string1 {
    public static void main(String[] args) {
        String name = "Alex";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);



        String nonTrimmedString = "     Alex    ";
        System.out.println(nonTrimmedString);
        // System.out.println(nonTrimmedString.trim());
        String trimmString = nonTrimmedString.trim();
        System.out.println(trimmString);



        System.out.println(name.substring(2));
        System.out.println(name.substring(1,3)); // start included but end is excluded

         System.out.println(name.replace('e', 't'));
         System.out.println(name.replace("le", "ti"));


         System.out.println(name.startsWith("Al"));
         System.out.println(name.endsWith("ex"));

         System.out.println(name.charAt(2));



         String modifiedName = "Alexlex";
         System.out.println(modifiedName.indexOf("lex"));  // 1
         System.out.println(modifiedName.indexOf("lex23443"));  // If not present then -1
         System.out.println(modifiedName.indexOf("lex", 4)); // 4

         System.out.println(modifiedName.lastIndexOf("lex"));
         System.out.println(modifiedName.lastIndexOf("lex", 3));

          System.out.println(name.equals("Alex"));
          // equalsIgnoreCase => It doesn't compare the lowercase and uppercase it just checks the value
          System.out.println(modifiedName.equalsIgnoreCase("alexlex"));
          System.out.println(modifiedName.equals("Alexlex"));



          // Escape sequence character
          System.out.println("I am escape sequence \' double quote");
          System.out.println("This is the java \n file ");
          System.out.println("This is the java \tfile ");



    }
}
