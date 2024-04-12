import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
    Scanner userValue = new Scanner(System.in);
    int a = userValue.nextInt();
    int b = userValue.nextInt();
    int sum =  a + b;

    System.out.println("The sum of " + a + " and " + b + " is: " +  sum);
    userValue.close();
    }
    
}
