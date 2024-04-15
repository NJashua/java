import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        }
    }
}

public class BankingSystem {
    private Map<String, Account> accounts;

    public BankingSystem() {
        accounts = new HashMap<>();
        //new Scanner(System.in);
    }

    public void createAccount(String accountNumber) {
        if (!accounts.containsKey(accountNumber) && (int) accountNumber.length() == 11) {
            Account account = new Account(accountNumber);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully with account number: " + accountNumber);
        
        }else if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists with account number: " + accountNumber);
        } else {
            System.out.println("Enter 11 digit account number");
        }
    }

    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void checkBalance(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Balance of account " + accountNumber + ": " + account.getBalance());
        } else {
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
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    bankingSystem.createAccount(accountNumber);
                    break;
                case 2:
                    System.out.println("Enter account number: ");
                    String depositAccount = scanner.nextLine();
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    bankingSystem.deposit(depositAccount, depositAmount);
                    break;
                case 3:
                    System.out.println("Enter your account number: ");
                    String withdrawAccount = scanner.nextLine();
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    bankingSystem.withdraw(withdrawAccount, withdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter account number: ");
                    String checkBalanceAccount = scanner.nextLine();
                    bankingSystem.checkBalance(checkBalanceAccount);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
