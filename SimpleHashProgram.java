//Name: Viet Trinh Nguyen
//Date: 2/26/25
//CS 240
// Programming hashing progam
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleHashProgram {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<Integer, String> hashMap = new HashMap<>();

        // Add some key-value pairs to the HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Grape");

        // Print all entries in the HashMap
        System.out.println("Initial HashMap contents:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Create a scanner to take user input
        Scanner input = new Scanner(System.in);

        // User input for searching the HashMap
        System.out.print("\nEnter a key (integer) to search for a fruit: ");
        int searchKey = input.nextInt();

        // Search for the key in the HashMap
        if (hashMap.containsKey(searchKey)) {
            System.out.println("The fruit corresponding to the key " + searchKey + " is: " + hashMap.get(searchKey));
        } else {
            System.out.println("Key " + searchKey + " not found.");
        }

        // User input for removing an item from the HashMap
        System.out.print("\nEnter a key to remove from the HashMap: ");
        int removeKey = input.nextInt();

        // Remove an item based on the key
        if (hashMap.containsKey(removeKey)) {
            hashMap.remove(removeKey);
            System.out.println("Key " + removeKey + " has been removed.");
        } else {
            System.out.println("Key " + removeKey + " not found, nothing to remove.");
        }

        // Print updated HashMap
        System.out.println("\nUpdated HashMap Entries:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        input.close();
    }
}
