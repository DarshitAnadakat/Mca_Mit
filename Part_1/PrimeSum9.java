/*9. Write a Java program to compute the sum of the first 100 prime numbers
*/

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
