import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number to generate the multiplication table
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Read the number

        // Initialize the counter for the while loop
        int counter = 1;

        // Print the multiplication table using a while loop
        System.out.println("Multiplication Table of " + number + ":");
        while (counter <= 10) {
            System.out.println(number + " x " + counter + " = " + (number * counter));
            counter++;  // Increment the counter
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}