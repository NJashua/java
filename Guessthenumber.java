import java.util.Scanner;
public class Guessthenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter your firstname: ");
       String firstName = scanner.next();
       System.out.println("Enter your lastname: ");
       String lastName = scanner.next();
       System.out.println("Enter your guess: ");
       int randomNumber = (int) Math.random();
       System.out.println(randomNumber);
       
        int guessNum = scanner.nextInt();
       
       if (randomNumber == guessNum){
           System.err.println(String.format("Hey %s %s you guess is correct..", firstName, lastName));
       }
       else if (randomNumber != guessNum) {
        System.out.println("Try again: ");
       }
       else{
           System.out.println(String.format("Try again %s", firstName));
       }
       scanner.close();
    }}