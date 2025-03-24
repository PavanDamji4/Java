import java.util.HashSet;  // Importing HashSet from Java's Collection Framework

public class JC_56_Hashset {
    public static void main(String[] args) {
        // Creating a HashSet with an initial capacity of 2 (capacity doesn't limit size, it just optimizes performance)
        HashSet h = new HashSet(2);

        // Adding elements to the HashSet
        h.add(334);      // Adds integer 334
        h.add("Pavan");  // Adds string "Pavan"
        h.add(3.45f);    // Adds float 3.45

        // Printing the HashSet
        System.out.println(h);

        // Note: The output will NOT be in the same order as elements were added.
        // This is because HashSet stores elements based on their hash values, not insertion order.
        // Example Output: [3.45, Pavan, 334]  (Order may vary)
    }
}
