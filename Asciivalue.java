/*  In this code you can find the ascii value of a character.
By taking the user input and after type conversion..,
import java.util.Scanner; */

import java.util.Scanner;
public class Asciivalue {
public static void main(String[] args){
    Scanner userValue = new Scanner(System.in);
    char charValue = userValue.next().charAt(0);
    int getAscii = (int) charValue;
    System.out.println("The ascii value is: "+ getAscii);
}
    
}
