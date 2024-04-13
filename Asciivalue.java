/*  In this code you can find the ascii value of a character.
By taking the user input and after type conversion..,
import java.util.Scanner; */

import java.util.Scanner;

public class Asciivalue {
    public static void main(String[] args) {
        Scanner userValue = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String charValue = userValue.nextLine();
        System.out.println("Length of the sentence: " + charValue.length());
        System.out.print("Enter an index : ");
        int pos = userValue.nextInt();
        if (pos >= 0 && pos < charValue.length()) {
            char alphabet = charValue.charAt(pos);
            int asciiValue = (int) alphabet;
            System.out.println(String.format("The sentence is:  %s \nand its ASCII value of %s at index %d is: %d", charValue, alphabet, pos, asciiValue));
        } else {
            System.out.println("Enter the index within range: ");
        }
        userValue.close(); // Closing the Scanner object
    }
}
