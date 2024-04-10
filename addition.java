import java.util.Scanner;

public class addition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int a = input.nextInt();
         int b = input.nextInt();
         float c = input.nextFloat();
         float d = input.nextFloat();

         System.out.println("The sum of " + a + " and " + b + " is " + a + b);
         System.out.println("The float value of " + c + " and " + d + " is " + c + d);
    }
}