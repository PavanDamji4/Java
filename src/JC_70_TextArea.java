import java.awt.*;

public class JC_70_TextArea extends Frame {
    // Declaring a label and text area
    Label l1;
    TextArea t = new TextArea("Address", 5, 20); // Creating a TextArea with default text, 5 rows, and 20 columns

    JC_70_TextArea(String str) {
        super(str);
        setLayout(new FlowLayout()); // Using FlowLayout for simple alignment

        l1 = new Label("Enter Address:"); // Label for the TextArea

        add(l1); // Adding label to the frame
        add(t);  // Adding text area to the frame

        // Displaying TextArea properties in the console
        System.out.println("Text in TextArea: " + t.getText()); // Getting the current text
        // t.setText("New Address");  --> Example of setting new text in the TextArea
        System.out.println("Is TextArea editable? " + t.isEditable()); // Checking if the text area is editable
    }

    public static void main(String[] args) {
        JC_70_TextArea f = new JC_70_TextArea("TextArea Example");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
