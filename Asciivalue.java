/*  In this code you can find the ascii value of a character.
By taking the user input and after type conversion..,
import java.util.Scanner; */

import java.util.Scanner;
public class Asciivalue {
public static void main(String[] args){
    Scanner userValue = new Scanner(System.in);
    System.out.print("Enter a Sentence : ");
    String charValue = userValue.nextLine();
    // System.out.println(charValue);
    System.out.println(charValue.length());
    System.out.print("Enter an index : ");
    int pos = userValue.nextInt();
    if (pos > 0 && pos < charValue.length() )
    {
        char Alphabet = charValue.charAt(pos);
        int getAscii = (int) Alphabet;
        System.out.println(String.format("The sentenc is:  %s \nand it's ASCII value of %s at index %d is: %d",charValue, Alphabet, pos));

    }
    else {
        System.out.println("Enter the index with in range: ");
    }

    userValue.close();
}
    
}
