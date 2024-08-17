/*9. Write a Java program to compute the sum of the first 100 prime numbers
10. Write a Java program to swap the first and last elements of an array and create a
new array
11. Write a Java program to count the number of even and odd elements in a given
array
12. Write a Java program to check if a positive number is a palindrome or not
13. Write a Java program to add two numbers without using any arithmetic
operators
14. Write a Java program to add all the digits of a given positive integer
15. Write a java program to Compute the Sum of the Principal and Secondary
Diagonals elements of a Matrix*/

public class PrimeSum9 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        int sum = 0;

        while (count < 100) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
