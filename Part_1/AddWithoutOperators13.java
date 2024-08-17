/*13. Write a Java program to add two numbers without using any arithmetic
operators*/

import java.util.Scanner;

public class AddWithoutOperators13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        scanner.close();

        int sum = add(a, b);
        System.out.println("Sum: " + sum);
    }

    private static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
