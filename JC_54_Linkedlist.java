import java.util.LinkedList;  // Importing the LinkedList class from Java's Collection Framework

// Class definition
public class JC_54_Linkedlist {

    // Constructor of the class
    JC_54_Linkedlist() {
        // Creating a LinkedList object
        LinkedList l = new LinkedList();

        // Adding elements to the LinkedList
        l.add(3);              // Adds integer 3 at the end of the list
        l.add("Pavan");        // Adds string "Pavan" at the end of the list

        // Adding an element at a specific index
        l.add(1, "Shubham");   // Inserts "Shubham" at index 1 (shifts elements to the right)

        // Adding an element at the beginning of the list
        l.addFirst("First");   // Adds "First" at the beginning of the LinkedList

        // Adding an element at the end of the list
        l.addLast("Last");     // Adds "Last" at the end of the LinkedList

        // Printing the LinkedList
        System.out.println(l); // Output: [First, 3, Shubham, Pavan, Last]
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        // Creating an instance of the class, which calls the constructor and executes the logic
        JC_54_Linkedlist j = new JC_54_Linkedlist();
    }
}
