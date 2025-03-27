import java.awt.*;

public class JC_68_CheckboxGroup extends Frame {

    // Declaring checkboxes and label
    Checkbox c1, c2;
    Label l1;

    // Creating a CheckboxGroup to ensure only one option is selected at a time
    CheckboxGroup cbg = new CheckboxGroup();

    // GridBagConstraints for layout positioning
    GridBagConstraints gbc = new GridBagConstraints();

    JC_68_CheckboxGroup(String str) {
        super(str);
        setLayout(new GridBagLayout()); // Setting GridBagLayout

        // Initializing components
        c1 = new Checkbox("Male", cbg, false);
        c2 = new Checkbox("Female", cbg, false); // Fixed spelling from "Femal" to "Female"
        l1 = new Label("Gender :- "); // Fixed spelling from "Genter" to "Gender"

        // Adding label to the frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(l1, gbc);

        // Adding first checkbox (Male)
        gbc.gridx = 1;
        add(c1, gbc);

        // Adding second checkbox (Female)
        gbc.gridx = 2;
        add(c2, gbc);

        // Printing the default state of the first checkbox
        System.out.println(c1.getState());
    }

    public static void main(String[] args) {
        JC_68_CheckboxGroup f = new JC_68_CheckboxGroup("Checkbox in Java");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
