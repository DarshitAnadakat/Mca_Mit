//define class bank with data members as cust_name, ac number and balance. use constructor and method withdraw and deposite . print the balance according to operation

import java.util.Scanner;

public class Bank {
    private String custName;
    private String acNumber;
    private double balance;
    private static Scanner scanner = new Scanner(System.in);

    public Bank() {
        System.out.print("Enter customer name: ");
        this.custName = scanner.nextLine();
        System.out.print("Enter account number: ");
        this.acNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        this.balance = scanner.nextDouble();
        scanner.nextLine(); 
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
        printBalance();
    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
        printBalance();
    }

    private void printBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        Bank account = new Bank();
        
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    account.deposit();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    System.out.println("Thank you for using our banking system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

