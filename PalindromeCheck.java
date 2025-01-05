import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();  // Read the input string

        // Use StringBuilder to reverse the string
        StringBuilder reversedString = new StringBuilder(originalString);
        reversedString.reverse();  // Reverse the string

        // Check if the original string is equal to the reversed string
        if (originalString.equals(reversedString.toString())) {
            System.out.println("\"" + originalString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + originalString + "\" is not a palindrome.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
