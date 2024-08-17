/*2. Write a Java program that takes five numbers as input to calculate and print the
average of the numbers*/
import java.util.Scanner;

public class AverageCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }
        
        double average = sum / 5;
        
        System.out.println("The average is: " + average);
        
        scanner.close();
    }
}
