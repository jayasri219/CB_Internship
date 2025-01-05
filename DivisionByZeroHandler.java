import java.util.Scanner;

public class DivisionByZeroHandler {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Try to perform the division and handle any exceptions
        try {
            // Attempt the division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch division by zero and print an error message
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    }
}
