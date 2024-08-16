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
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;
            case 2:  // February
                days = 28; // For simplicity, not considering leap years
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return; // Exit the program if the month is invalid
        }

        System.out.println("Number of days in month " + month + ": " + days);
        scanner.close();
    }
}
