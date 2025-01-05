import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number to a string
        String numberStr = Integer.toString(number);

        // Initialize an empty string to store the reversed number
        String reversedStr = "";

        // Use a for loop to iterate over the number string in reverse order
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedStr += numberStr.charAt(i);  // Append each character in reverse order
        }

        // Output the reversed number
        System.out.println("Reversed Number: " + reversedStr);

        // Close the scanner
        scanner.close();
    }
}