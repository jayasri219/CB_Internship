import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Try to open the file and read its content
            reader = new BufferedReader(new FileReader("sample.txt"));
            String line = reader.readLine();

            if (line != null) {
                System.out.println("File content: " + line);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            // Catch any IOExceptions (e.g., FileNotFoundException or IO errors)
            System.out.println("Error: File not found or cannot be read.");
        } finally {
            // Ensure the file is closed, whether or not an exception occurred
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File operation completed.");
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }
}
