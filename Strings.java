/* strings contains stream of characters in within double qoutes for example x = "nithin jashua"..
int this Strings.java you can find severel operations which is performed by using java strings */

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String text = "Hello";
        System.out.println(text);
        // finding the length of the string like 
        String subString = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(subString);
        // There are many string methods available, for example toUpperCase() and toLowerCase():
        String toUpper = "nithin jashua...";
        // System.out.println(toUpper.toUpperCase());
        System.out.println(String.format("%s , %s",text.toUpperCase(),toUpper.toUpperCase()));

        /*Finding a Character in a String
        The indexOf() method returns the index (the position) of the first occurrence of a specified
         text in a string (including whitespace): */
         String sentence = String.format("%s %s",text,toUpper);
         System.out.println(String.format("The length of the sentence:  %s is %d", sentence, sentence.length()));
         Scanner userValue = new Scanner(System.in);
         System.out.print("Enter the index 1: ");
         int pos1 = userValue.nextInt();
         System.out.print("Enter the index 2: ");
         int pos2 = userValue.nextInt();
        System.out.println(String.format("Addition of %c Ascii (%d) + %c Ascii (%d) is %d",sentence.charAt(pos1),(int)sentence.charAt(pos1),sentence.charAt(pos2),(int)sentence.charAt(pos2),((int)sentence.charAt(pos1) + (int)sentence.charAt(pos2))));
        // System.out.println(String.format("Addition of %c + %c is %d", sentence.charAt(pos1), sentence.charAt(pos2), ((int) sentence.charAt(pos1) + (int) sentence.charAt(pos2))));

        //  System.out.println(String.format("Ascii value of %s is %d",sentence.charAt(pos),(int)sentence.charAt(pos) )); 
         userValue.close(); 
    }
    
}
