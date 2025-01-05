import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingList {

    // Method to add items to the shopping list
    public static void addItem(LinkedList<String> list, String item, boolean atStart) {
        if (atStart) {
            list.addFirst(item); // Adds item at the beginning
        } else {
            list.addLast(item);  // Adds item at the end
        }
    }

    // Method to remove a specific item from the shopping list
    public static void removeItem(LinkedList<String> list, String item) {
        if (list.contains(item)) {
            list.remove(item); // Removes the item by name
            System.out.println("Item '" + item + "' removed.");
        } else {
            System.out.println("Item '" + item + "' not found in the list.");
        }
    }

    // Method to print the shopping list
    public static void printList(LinkedList<String> list) {
        System.out.println("Current Shopping List: " + list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> shoppingList = new LinkedList<>();

        // Adding items to the list
        System.out.print("Enter the item to add to the list: ");
        shoppingList.add(scanner.nextLine());
        System.out.print("Enter the item to add to the list: ");
        shoppingList.add(scanner.nextLine());
        System.out.print("Enter the item to add to the list: ");
        shoppingList.add(scanner.nextLine());

        // Printing the current list of items
        printList(shoppingList);

        // Asking if the user wants to remove an item
        System.out.print("Do you want to remove an item? (yes/no): ");
        String removeChoice = scanner.nextLine();

        if (removeChoice.equalsIgnoreCase("yes")) {
            // Removing an item
            System.out.print("Enter the item to remove: ");
            String itemToRemove = scanner.nextLine();
            removeItem(shoppingList, itemToRemove);
        }

        // Printing the updated list after removal (if any)
        printList(shoppingList);

        scanner.close();
    }
}
