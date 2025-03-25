import java.awt.*;  // Importing Abstract Window Toolkit (AWT) for GUI components

// Creating a class that extends Frame to create a window
public class JC_58_Label extends Frame {

    // Declaring a Label component
    Label l1;

    // Constructor to initialize the frame and label
    JC_58_Label(String str) {
        super(str); // Calls the parent Frame class constructor to set the window title

        // Creating a Label with text "Label 1" and aligning it to the center
        l1 = new Label("Label 1", Label.CENTER);

        // Updating the label text to "LABEL 1" after creation
        l1.setText("LABEL 1");

        // Setting the background color of the label to RED
        l1.setBackground(Color.RED);

        // Adding the label to the frame
        add(l1);

        // Printing the label text to the console
        System.out.println(l1.getText());  // Output: LABEL 1

        // Printing the alignment value (CENTER = 1, LEFT = 0, RIGHT = 2)
        System.out.println(l1.getAlignment()); // Output: 1 (CENTER)
    }

    public static void main(String[] args) {
        // Creating a frame with the title "Label in Advanced Java"
        JC_58_Label f = new JC_58_Label("Label in Advanced Java");

        // Setting the size of the window to 400x400 pixels
        f.setSize(400, 400);

        // Making the frame visible
        f.setVisible(true);
    }
}
