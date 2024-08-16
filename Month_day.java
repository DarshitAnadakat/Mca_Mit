import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        } else {
            int days = daysInMonths[month - 1];
            System.out.println("Number of days in month " + month + ": " + days);
        }

        scanner.close();
    }
}

// using switch case

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        int days = 0;

        switch (month) {
            case 1:  
            case 3:  
            case 5:  
            case 7:  
            case 8:  
            case 10: 
            case 12: 
                days = 31;
                break;
            case 4:  
            case 6:  
            case 9:  
            case 11: 
                days = 30;
                break;
            case 2:  // February
                days = 28; 
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return; 
        }

        System.out.println("Number of days in month " + month + ": " + days);
        scanner.close();
    }
}
