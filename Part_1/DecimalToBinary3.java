import java.util.Scanner;

public class DecimalToBinary3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String binary = "";
        int temp = decimal;
        
        if (decimal == 0) {
            binary = "0";
        } else {
            while (temp > 0) {
                binary = (temp % 2) + binary;
                temp = temp / 2;
            }
        }
        
        System.out.println("Binary representation of " + decimal + " is: " + binary);
        
        scanner.close();
    }
}