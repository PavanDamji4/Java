import java.util.ArrayList;  // Importing the ArrayList class from the Java Collection Framework

// Class definition
public class JC_53_Arraylist {

    // Constructor of the class
    JC_53_Arraylist() {
        // Creating an ArrayList object
        ArrayList al = new ArrayList();

        // Adding elements to the ArrayList
        al.add(34);        // Adds integer 34
        al.add("safi");    // Adds string "safi"
        al.add(232);       // Adds integer 232

        // Adding an element at a specific index
        al.add(1, 2);  // Inserts integer 2 at index 1 (shifts existing elements to the right)

        // Printing the ArrayList
        System.out.println(al); // Output: [34, 2, "safi", 232]
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        // Creating an instance of the class, which calls the constructor and executes the logic
        JC_53_Arraylist arl = new JC_53_Arraylist();
    }
}
