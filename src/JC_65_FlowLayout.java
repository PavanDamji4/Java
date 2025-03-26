import java.awt.*;

public class JC_65_FlowLayout extends Frame {
    Button b1 = new Button("OK");
    Button b2 = new Button("Cancel");

    JC_65_FlowLayout(String str) {
        super(str);

        // Setting FlowLayout with center alignment and horizontal & vertical gaps of 10 pixels
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        add(b1); // Adding "OK" button to the frame
        add(b2); // Adding "Cancel" button to the frame
    }

    public static void main(String[] args) {
        JC_65_FlowLayout f = new JC_65_FlowLayout("Layout Manager: Flow Layout");
        f.setVisible(true); // Making the frame visible
        f.setSize(400, 400); // Setting frame size
    }
}
