import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankingSystem {
    private Map<String, Account> accounts;
    private Scanner scanner;

    public BankingSystem(){
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);
    }
    
public void createAccount(String accountNumber) {
    if (!accounts.containsKey(accountNumber)){
        Account account = new Account(accountNumber);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully with account number: "+ accountNumber);
    }else{
        System.out.println("Acount already exists with account numnber: "+ accountNumber);
    }
    
}

public void deposit(String accountNumber ,double  amount){
    Account account = accounts.get(accountNumber);
    if (account != null){
        account.deposit(amount);
    }else{
        System.out.println("Account not found.");
    }
}

public void withdraw(String accountNumber,double amount){
    Account account = accounts.get(accountNumber);
    if (account != null){
        account.withdraw(amount);
    }
    else{System.out.println("Account not found");
    }
}

public void checkBalance(String accounNumber){
    Account account = accounts.get(accounNumber);
    if (account != null){
        System.out.println("Balance of account " + accounNumber + ": " + account.getAccountNumber());
    }else{
        System.out.println("Account not found.");
    }
}

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    bankingSystem.createAccount(accountNumber);
                    break;
                case 2:
                    System.out.println("Enter account number: ");
                    String depositAccount = scanner.nextLine();
                    System.out.println("Enter deposti amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankingSystem.deposit(depositAccount, depositAmount);
                case 3: 
                    System.out.println("Entere your account number: ");
                    String withdrawAccount = scanner.nextLine();
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bankingSystem.withdraw(withdrawAccount, withdrawAmount);
                case 4:
                    System.out.println("Enter account number: ");
                    String checkBalanceAccount = scanner.nextLine();
                    bankingSystem.checkBalance(checkBalanceAccount);    
                    break;    
                case 5:
                System.out.println("Exiting...");
                System.exit(0);
                scanner.close();
                break;
            
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
};