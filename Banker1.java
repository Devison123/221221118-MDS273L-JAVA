import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Banker1 {
    private static int accountNumber;
    private static String accountHolderName;
    private static double accountBalance;

    // Function to add customer details
    public static void addCustomerDetails(int accountNumber, String accountHolderName, double accountBalance) {
        Banker1.accountNumber = accountNumber;
        Banker1.accountHolderName = accountHolderName;
        Banker1.accountBalance = accountBalance;
    }

    // Function to deposit money
    public static void deposit(double amount, ArrayList<String> transactions) {
        transactions.add("**********************************************");
        transactions.add(getCurrentTimestamp());
        transactions.add("available balance :" + accountBalance);
        accountBalance += amount;
        transactions.add("Deposit: " + amount);
        transactions.add("available balance :" + accountBalance);
        
        System.out.println("\nDeposit successful!");
        System.out.println("current balance is "+accountBalance);
    }
    // fuction for timestamp
    public static String getCurrentTimestamp() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
    // Function to withdraw money
    public static void withdraw(double amount, ArrayList<String> transactions) {
        if (amount > accountBalance) {
            System.out.println("Insufficient balance!");
        } else {
            transactions.add("**********************************************");
            transactions.add(getCurrentTimestamp());
            transactions.add("available balance :" + accountBalance);  
            accountBalance -= amount;
            transactions.add("Withdrawal: " + amount);
            transactions.add("available balance :" + accountBalance);
            System.out.println( "WITHDRAWAL successful!");
            System.out.println("current balance is "+ accountBalance);

        }
    }

    // Function to print transaction statements
    public static void printTransactionStatements(ArrayList<String> transactions) {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Function to print account summary
    public static void printAccountSummary() {
        System.out.println("Account summary:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> transactions = new ArrayList<>(); 

        
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter account holder name:");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter account balance:");
        double accountBalance = scanner.nextDouble();
        addCustomerDetails(accountNumber, accountHolderName, accountBalance);

        
        while (true) {
            System.out.println("\nEnter 1 to deposit money");
            System.out.println("Enter 2 to withdraw money");
            System.out.println("Enter 3 to print transaction statements");
            System.out.println("Enter 4 to print account summary");
            System.out.println("Enter 5 to exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount, transactions);
                    

                    break;
                case 2:
                    System.out.println("\nEnter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount, transactions);
                    
                    break;
                case 3:
                    printTransactionStatements(transactions);
                    break;
                case 4:
                    printAccountSummary();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice!");
            }
        }
    }
}

