import java.awt.*;

public class JC_66_GridLayout extends Frame {
    Button b1, b2, b3, b4;

    JC_66_GridLayout(String str) {
        super(str);

        // Setting GridLayout with 2 rows, 2 columns, and 20-pixel gaps between components
        setLayout(new GridLayout(2, 2, 20, 20));

        // Creating buttons
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");

        // Adding buttons to the frame in grid format
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }

    public static void main(String[] args) {
        JC_66_GridLayout f = new JC_66_GridLayout("Layout Manager: Grid Layout");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
