import java.util.Scanner;

public class EmployeeSalaryCalculation {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter years of experience
        System.out.print("Enter years of experience: ");
        int experience = scanner.nextInt();

        // Initialize the salary variable
        double salary;

        // If-else ladder to calculate salary based on experience
        if (experience > 10) {
            salary = 100000;
        } else if (experience >= 5 && experience <= 10) {
            salary = 75000;
        } else if (experience >= 0 && experience < 5) {
            salary = 50000;
        } else {
            // If experience is negative, it's invalid
            System.out.println("Invalid input. Experience cannot be negative.");
            return; // Exit the program if input is invalid
        }

        // Output the calculated salary
        System.out.println("Salary: " + salary);

        // Close the scanner
        scanner.close();
    }
}