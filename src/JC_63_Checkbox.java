import java.awt.*;

public class JC_63_Checkbox extends Frame {
    Checkbox c1; // Declaring a Checkbox

    JC_63_Checkbox(String str) {
        super(str);

        c1 = new Checkbox("Checkbox1", true); // Creating a checkbox with label "Checkbox1" and setting it to checked by default

        // Alternative way to create another checkbox and make it pre-selected:
        // c1 = new Checkbox("Checkbox2", true);

        add(c1); // Adding checkbox to the frame

        System.out.println(c1.getState()); // Prints 'true' if the checkbox is checked, 'false' otherwise
    }

    public static void main(String[] args) {
        JC_63_Checkbox f = new JC_63_Checkbox("Checkbox in Java");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
