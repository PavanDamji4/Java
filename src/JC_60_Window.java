// From this point forward, we are going to learn about Advanced Java
import java.awt.*;  // Importing the AWT (Abstract Window Toolkit) package for GUI components

// Creating a class that extends Frame (a GUI window)
public class JC_57_Window extends Frame {

    // Constructor that takes a title as an argument
    JC_57_Window(String str) {
        super(str); // Calls the constructor of the Frame class to set the window title
    }

    public static void main(String[] args) {
        // Creating an instance of the JC_57_Window class with a title
        JC_57_Window w = new JC_57_Window("Creating a Window");

        // Setting the size of the window to 400x400 pixels
        w.setSize(400, 400);

        // Making the window visible
        w.setVisible(true);
    }
}
