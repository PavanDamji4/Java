import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JC_74_ItemListener extends Frame implements ItemListener {
    CheckboxGroup cbg=new CheckboxGroup();
    Checkbox c1,c2;
    Label l1;
    String msg="";

    JC_74_ItemListener(String str) {
        super(str);
        setLayout(new FlowLayout());
        c1=new Checkbox("Male",cbg,false);
        c2= new Checkbox("Female",cbg,false);
        l1= new Label("Gender");

        add(l1);
        add(c1);
        add(c2);

        c1.addItemListener(this);
        c2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource()==c1)
        {
            msg=c1.getLabel();
        }
        else if(e.getSource()==c2)
        {
            msg=c2.getLabel();
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString("You are "+msg,20,20);
    }

    // Main Method
    public static void main(String[] args) {
        JC_74_ItemListener f = new JC_74_ItemListener("ActionListener in Java");
        f.setSize(400, 300);
        f.setVisible(true);
    }
}
