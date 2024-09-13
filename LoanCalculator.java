//write a program to calculate the total amount payable with annual interest for given number of years, the input are principle amount , rate of interest and number of years, attend the program with and without recursion


import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        
        // Without recursion
        double totalAmountWithoutRecursion = calculateTotalAmountWithoutRecursion(principal, annualInterestRate, years);
        System.out.printf("Total amount payable (without recursion): $%.2f%n", totalAmountWithoutRecursion);
        
        // With recursion
        double totalAmountWithRecursion = calculateTotalAmountWithRecursion(principal, annualInterestRate, years);
        System.out.printf("Total amount payable (with recursion): $%.2f%n", totalAmountWithRecursion);
        
        scanner.close();
    }
    
    // Method to calculate total amount without recursion
    public static double calculateTotalAmountWithoutRecursion(double principal, double annualInterestRate, int years) {
        double interestRate = annualInterestRate / 100;
        double totalAmount = principal;
        
        for (int i = 0; i < years; i++) {
            totalAmount += totalAmount * interestRate;
        }
        
        return totalAmount;
    }
    
    // Method to calculate total amount with recursion
    public static double calculateTotalAmountWithRecursion(double principal, double annualInterestRate, int years) {
        if (years == 0) {
            return principal;
        } else {
            double interestRate = annualInterestRate / 100;
            return calculateTotalAmountWithRecursion(principal * (1 + interestRate), annualInterestRate, years - 1);
        }
    }
}

