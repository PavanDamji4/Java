import java.awt.*;

public class JC_67_GridBagLayout extends Frame {

    // Declaring labels for form fields
    Label l1, l2, l3, l4, l5;

    // Declaring text fields for user input
    TextField name = new TextField(20);
    TextField add = new TextField(20);
    TextField bdy = new TextField(20);

    // Declaring checkbox groups for Gender and Job
    Checkbox m, f, stud, tea;
    CheckboxGroup cgp = new CheckboxGroup(); // Grouping gender checkboxes
    CheckboxGroup cgp2 = new CheckboxGroup(); // Grouping job checkboxes

    JC_67_GridBagLayout(String str) {
        super(str);
        setLayout(new GridBagLayout()); // Setting layout as GridBagLayout

        // Initializing labels
        l1 = new Label("Name");
        l2 = new Label("Address");
        l3 = new Label("Birthday");
        l4 = new Label("Gender");
        l5 = new Label("Job");

        // Initializing checkboxes for Gender and Job
        m = new Checkbox("Male", cgp, false);
        f = new Checkbox("Female", cgp, false);
        stud = new Checkbox("Student", cgp2, false);
        tea = new Checkbox("Teacher", cgp2, false);

        // Initializing buttons
        Button b1 = new Button("Register");
        Button b2 = new Button("Exit");

        // Adding components with GridBagLayout constraints
        GBadd(l1, 0, 0);
        GBadd(name, 1, 0);
        GBadd(l2, 0, 1);
        GBadd(add, 1, 1);
        GBadd(l3, 0, 2);
        GBadd(bdy, 1, 2);
        GBadd(l4, 0, 3);
        GBadd(m, 1, 3);
        GBadd(f, 2, 3);
        GBadd(l5, 0, 4);
        GBadd(stud, 1, 4);
        GBadd(tea, 2, 4);
        GBadd(b1, 1, 5);
        GBadd(b2, 2, 5);
    }

    // Method to add components using GridBagLayout constraints
    void GBadd(Component c, int a, int b) {
        GridBagConstraints con = new GridBagConstraints(); // Creating a new GridBagConstraints object for each component
        con.gridx = a; // Setting x position
        con.gridy = b; // Setting y position
        con.anchor = GridBagConstraints.WEST; // Aligning components to the left
        con.insets = new Insets(5, 5, 5, 5); // Adding padding between components
        add(c, con);
    }

    public static void main(String[] args) {
        JC_67_GridBagLayout f = new JC_67_GridBagLayout("Layout Manager: GridBagLayout");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
