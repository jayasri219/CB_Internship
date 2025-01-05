import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Read the input string

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;  // If it's not a vowel, it must be a consonant
                }
            }
        }

        // Output the results
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
