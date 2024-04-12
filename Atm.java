import java.util.Scanner;
public class Atm {
    // initializing the amount with a variable datatype double and its used to take long number.
    private static double balance = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SBI Atm.");
        while (true) {
            // System.out.println("Welcome to Atm");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("1. Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4: 
                    System.out.println("Thank you for using SBI Banking Atm. excited to see you again.");
                    System.exit(0);
            
                default:
                System.out.println("Invalid option choosen, try again..");
                    break;
            }
        }
    }
    private static void checkBalance(){
        System.out.print("Your balance is: $"+ balance+ " ");
    }
    private static void depositMoney(Scanner scanner){
        System.out.println("Enter amount to deposit: $");
        double amount= scanner.nextDouble();

        if (amount > 0){
            balance += amount;
            System.out.println("Deposit successfull. Your new balance: $"+ balance);
        }
        else{
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
    private static void withdrawMoney(Scanner scanner){
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount>0){
            if (amount <= balance){
                balance -= amount;
            System.err.println("Withdrawal successful. Your current balance $"+ balance);
        }else{
            System.out.println("Insufficient funds. Your current balance is $"+balance);
        }
        }else{
            System.out.println("Invalid amount. Please enter a positive number");
        }
}
}