import java.util.ArrayDeque;  // Importing ArrayDeque class from Java's Collection Framework
import java.util.HashSet;

public class JC_55_ArrayDeque {
    public static void main(String[] args) {
        // Creating an ArrayDeque with an initial capacity of 3
        ArrayDeque dq = new ArrayDeque(3);

        // Adding elements to the deque (Double-Ended Queue)
        dq.add("Pavan");     // Adds "Pavan" at the end
        dq.add(23);          // Adds integer 23 at the end
        dq.add(27);          // Adds integer 27 at the end

        // Adding elements at the first and last positions
        dq.addFirst("First");  // Adds "First" at the beginning
        dq.addLast("Last");    // Adds "Last" at the end

        // Printing the entire deque
        System.out.println(dq); // Output: [First, Pavan, 23, 27, Last]

        // Retrieving the first and last elements
        System.out.println(dq.getFirst());  // Output: First
        System.out.println(dq.getLast());   // Output: Last

    }
}
