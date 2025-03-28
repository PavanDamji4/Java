import java.awt.*;

public class JC_72_FileDialog extends Frame {

    JC_72_FileDialog(String str) {
        super(str);

        // Creating buttons
        Button b1 = new Button("Home");
        Button b2 = new Button("Save");

        // Setting layout before adding components
        setLayout(new FlowLayout());

        // Adding buttons to the frame
        add(b1);
        add(b2);

        // Setting frame properties
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Creating frame object
        JC_72_FileDialog f = new JC_72_FileDialog("File Dialog Box");

        // Creating FileDialog instance (for saving a file)
        FileDialog fd = new FileDialog(f, "File Dialog Save", FileDialog.SAVE);
        fd.setVisible(true);
    }
}
