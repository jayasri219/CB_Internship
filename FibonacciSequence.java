import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1;

        // Check if the user entered a valid number of terms
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Print the Fibonacci sequence
            System.out.print("Fibonacci sequence: ");
            
            // Initialize a counter to keep track of the terms printed
            int count = 0;
            
            // Use a while loop to print the Fibonacci sequence up to n terms
            while (count < n) {
                System.out.print(a + " ");
                
                // Update the Fibonacci numbers
                int nextTerm = a + b;
                a = b;
                b = nextTerm;
                
                // Increment the counter
                count++;
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}