import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        String getValue = (boolean) (userInput >= 0) ? "it's pos" : "it's neg"; 
        System.out.println(getValue);
        scanner.close();
    }
}