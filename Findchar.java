import java.util.Scanner;

public class Findchar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");     
        String sentence = scanner.nextLine();
        System.out.println("Enter the char value to find: ");
        char charValue = scanner.next().charAt(0);
        int index = sentence.indexOf(charValue);
        if (index != -1){
            System.out.print(String.format("The charecter %s was found in index of %d in a sentence and its ascii value is %d...", charValue, index, (int) charValue));
        }else{
            System.out.println(String.format("The character %s was not found in the given sentence" , charValue));
        }
        scanner.close();
}
}