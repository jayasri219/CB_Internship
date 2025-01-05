import java.util.Scanner;
public class PrimeNumberCheck {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Read the number

        // Check if the number is prime
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;

            // Check divisibility from 2 to the square root of the number
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;  // Number is divisible by i, so it is not prime
                    break;  // No need to check further
                }
            }

            // Output result based on isPrime
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
