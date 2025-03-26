import java.awt.*;

public class JC_64_BorderLayout extends Frame {
    Button b1, b2, b3, b4, b5; // Declaring multiple buttons

    JC_64_BorderLayout(String str) {
        super(str);

        setLayout(new BorderLayout(10, 10)); // Setting BorderLayout with horizontal & vertical gaps of 10 pixels

        // Creating buttons with labels
        b1 = new Button("East");
        b2 = new Button("West");
        b3 = new Button("North");
        b4 = new Button("South");
        b5 = new Button("Center");

        // Adding buttons to specific BorderLayout positions
        add(b1, BorderLayout.EAST);   // Button placed on the right side
        add(b2, BorderLayout.WEST);   // Button placed on the left side
        add(b3, BorderLayout.NORTH);  // Button placed at the top
        add(b4, BorderLayout.SOUTH);  // Button placed at the bottom
        add(b5, BorderLayout.CENTER); // Button placed at the center
    }

    public static void main(String[] args) {
        JC_64_BorderLayout f = new JC_64_BorderLayout("Layout Manager: Border Layout");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
