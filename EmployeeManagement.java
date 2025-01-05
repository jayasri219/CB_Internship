import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create a TreeSet to store employee IDs
        TreeSet<Integer> employeeIds = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        // Ask for input
        System.out.println("Enter employee IDs (type 'done' to stop):");

        while (true) {
            System.out.print("Insert employee ID: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break; // Exit loop if user types 'done'
            }

            try {
                int employeeId = Integer.parseInt(input);
                employeeIds.add(employeeId); // Add the employee ID to the TreeSet
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a valid number.");
            }
        }

        // Display the employee IDs in sorted order
        System.out.println("Employee IDs (sorted): " + employeeIds);
        scanner.close();
    }
}
