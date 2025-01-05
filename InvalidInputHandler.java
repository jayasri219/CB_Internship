import java.util.Scanner;

public class InvalidInputHandler {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the user input
        int number = 0;

        // Try block to handle potential exceptions
        try {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            number = scanner.nextInt();  // This might throw InputMismatchException

            // Perform division by 2
            int result = number / 0;  // This will throw ArithmeticException if division by zero
            System.out.println("Result: " + result);
        }
        // Catching InputMismatchException (non-integer input)
        catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
        // Catching ArithmeticException (division by zero)
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    }
}
