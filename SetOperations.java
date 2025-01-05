import java.util.HashSet;

public class SetOperations {
    public static void main(String[] args) {
        // Create a HashSet and add some initial items
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Display the initial set
        System.out.println("Initial Set: " + set);

        // Remove an item
        String itemToRemove = "banana";
        set.remove(itemToRemove);
        System.out.println("Set after removal: " + set);

        // Check if an item exists in the set
        String itemToCheck = "orange";
        boolean exists = set.contains(itemToCheck);
        System.out.println("'" + itemToCheck + "' exists in the set: " + exists);
    }
}

