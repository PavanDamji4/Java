import java.awt.*;

public class JC_62_Button extends Frame {
    Button b1; // Creating a Button object

    JC_62_Button(String str) {
        super(str);

        b1 = new Button("Button1"); // Creating a button with label "Button1"

        // Alternative way to set label: b1.setLabel("Button1");

        b1.setBackground(Color.CYAN); // Setting background color of the button

        add(b1); // Adding button to the frame
    }

    public static void main(String[] args) {
        JC_62_Button f = new JC_62_Button("Button");
        f.setVisible(true); // Making the frame visible
        f.setSize(400, 400); // Setting window size
    }
}
