import java.util.HashSet;
import java.util.Scanner;

public class UniqueWordsInSentence {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Create a HashSet to store unique words
        HashSet<String> uniqueWords = new HashSet<>();

        // Split the sentence into words (using whitespace as delimiter)
        String[] words = sentence.split("\\s+");

        // Add each word to the HashSet (duplicates will be automatically ignored)
        for (String word : words) {
            // Remove any non-alphabetical characters and trim spaces
            String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!cleanWord.isEmpty()) {
                uniqueWords.add(cleanWord);
            }
        }

        // Display the unique words
        System.out.println("Unique words: " + uniqueWords);

        // Close the scanner
        scanner.close();
    }
}

