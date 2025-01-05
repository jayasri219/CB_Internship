import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;

    // Constructor to initialize student object
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Override toString method to display student information
    @Override
    public String toString() {
        return name + " (Roll Number: " + rollNumber + ")";
    }
}

public class StudentDatabase {
    private ArrayList<Student> students; // ArrayList to store student objects

    // Constructor to initialize the ArrayList
    public StudentDatabase() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(String name, int rollNumber) {
        Student student = new Student(name, rollNumber);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Method to remove a student by roll number
    public void removeStudent(int rollNumber) {
        boolean found = false;
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                students.remove(student);
                found = true;
                System.out.println("Student removed successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            System.out.println("Students in the database:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase database = new StudentDatabase();

        while (true) {
            System.out.println("\nStudent Database Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // To consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // To consume the newline character
                    database.addStudent(name, rollNumber);
                    break;

                case 2:
                    System.out.print("Enter student roll number to remove: ");
                    int rollNoToRemove = scanner.nextInt();
                    scanner.nextLine(); // To consume the newline character
                    database.removeStudent(rollNoToRemove);
                    break;

                case 3:
                    database.displayStudents();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
