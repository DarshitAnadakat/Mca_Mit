import java.util.Scanner;

public class BinaryToDecimal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        
        int decimal = 0;
        int power = 0;
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        
        System.out.println("Decimal equivalent of " + binary + " is: " + decimal);
        
        scanner.close();
    }
}