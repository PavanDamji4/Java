import java.awt.*;

public class JC_71_Menu extends Frame {
    // Creating a MenuBar
    MenuBar mbr = new MenuBar();

    // Declaring menus and menu items
    Menu f, e, sa;
    MenuItem n, o, sapdf, sawd, cu, pas;
    CheckboxMenuItem m = new CheckboxMenuItem("Demo"); // Checkbox menu item

    JC_71_Menu(String str) {
        super(str);

        // Setting the MenuBar to the Frame
        setMenuBar(mbr);

        // Initializing Menus
        f = new Menu("File");
        e = new Menu("Edit");
        sa = new Menu("Save as");

        // Initializing Menu Items
        n = new MenuItem("New");
        o = new MenuItem("Open");
        sapdf = new MenuItem("Save as Pdf");
        sawd = new MenuItem("Save as Word");
        cu = new MenuItem("Cut");
        pas = new MenuItem("Paste");

        // Adding menus to the MenuBar
        mbr.add(f);
        mbr.add(e);

        // Adding items to the "File" menu
        f.add(n);
        f.add(o);
        f.add(m); // Adding checkbox menu item to File menu

        // Adding items to the "Edit" menu
        e.add(cu);
        e.add(pas);
        e.addSeparator(); // Adding a separator line in the menu
        e.add(sa); // Adding "Save as" menu

        // Adding items to "Save as" submenu
        sa.add(sapdf);
        sa.add(sawd);

        // Setting frame properties
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        JC_71_Menu f = new JC_71_Menu("MenuBar and MenuItem Example");
    }
}
