import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the marks of the student
        System.out.print("Enter the marks of the student: ");
        int marks = scanner.nextInt();  // Read the marks

        // Validate the marks to ensure they are within the correct range
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else {
            // Use if-else ladder to determine the grade based on the marks
            if (marks > 90) {
                System.out.println("Grade: A");
            } else if (marks > 75) {
                System.out.println("Grade: B");
            } else if (marks > 60) {
                System.out.println("Grade: C");
            } else if (marks > 40) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
