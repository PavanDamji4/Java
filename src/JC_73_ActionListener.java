import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JC_73_ActionListener extends Frame implements ActionListener {
    // Declaring TextFields, Buttons, and Labels
    TextField t1, t2, t3, t4;
    Button b1, b2;
    Label l1, l2, l3, l4;

    // Constructor
    JC_73_ActionListener(String str) {
        super(str);

        // Setting Grid Layout (5 rows, 2 columns)
        setLayout(new GridLayout(5, 2));

        // Initializing Components
        b1 = new Button("Add");
        b2 = new Button("Subtract");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);  // Result of Addition
        t4 = new TextField(20);  // Result of Subtraction

        // Making result fields non-editable
        t3.setEditable(false);
        t4.setEditable(false);

        l1 = new Label("Number 1:");
        l2 = new Label("Number 2:");
        l3 = new Label("Addition Result:");
        l4 = new Label("Subtraction Result:");

        // Adding Components to the Frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(t3);
        add(b2);
        add(t4);

        // Adding ActionListener to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    // Handling Button Click Events
    public void actionPerformed(ActionEvent e) {
        try {
            // Converting input text to integers
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            // Checking which button was clicked
            if (e.getSource() == b1) {
                t3.setText(String.valueOf(num1 + num2));  // Addition
            } else if (e.getSource() == b2) {
                t4.setText(String.valueOf(num1 - num2));  // Subtraction
            }
        } catch (NumberFormatException ex) {
            // Handling invalid input (non-numeric values)
            t3.setText("Invalid Input");
            t4.setText("Invalid Input");
        }
    }

    // Main Method
    public static void main(String[] args) {
        JC_73_ActionListener f = new JC_73_ActionListener("ActionListener in Java");
        f.setSize(400, 300);
        f.setVisible(true);
    }
}
