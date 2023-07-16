import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formgui extends JFrame implements ActionListener {
    JFrame jf;
    JLabel name, pass, details;
    JTextField n, d;
    JPasswordField p;
    JButton s, r;

    Formgui() {
        jf = new JFrame("LOGIN FORM");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        name = new JLabel("NAME :");
        add(name);

        n = new JTextField(10);
       
        add(n);

        pass = new JLabel("PASSWORD: ");
        
        add(pass);

        p = new JPasswordField(10);
        
        add(p);

        details = new JLabel("DETAILS :");
        
        add(details);

        d = new JTextField(30);
        d.setSize(150,80);
        
        
        add(d);

        s = new JButton("SUBMIT");
        
        add(s);

        r = new JButton("RESET");
        
        add(r);

        s.addActionListener(this);
        r.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == s) {
            String s1 = "NAME :" + n.getText();
            String s2 = "PASSWORD: " + String.valueOf(p.getPassword());
            d.setText(s1 +"\n"+s2);
        } else if (e.getSource() == r) {
            n.setText("");
            p.setText("");
            d.setText("");
        }
    }

    public static void main(String[] args) {
        Formgui f = new Formgui();
    }
}
