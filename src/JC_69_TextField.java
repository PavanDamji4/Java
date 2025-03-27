import java.awt.*;

public class JC_69_TextField extends Frame {

    // Declaring a label and text field
    Label l1;
    TextField t = new TextField("Enter Address", 20); // Creating a TextField with default text and width

    JC_69_TextField(String str) {
        super(str);
        setLayout(new FlowLayout()); // Using FlowLayout for component arrangement

        l1 = new Label("Enter Address :- "); // Label for the TextField

        add(l1); // Adding label to the frame
        add(t);  // Adding text field to the frame

        // Displaying text field properties in the console
        System.out.println(t.getText()); // Getting the current text in the field
        System.out.println(t.getSelectedText()); // Getting selected text (if any)
        // t.setText("New Address");  --> Example of setting new text in the TextField
        System.out.println(t.isEditable()); // Checking if the text field is editable
    }

    public static void main(String[] args) {
        JC_69_TextField f = new JC_69_TextField("TextField Example");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
