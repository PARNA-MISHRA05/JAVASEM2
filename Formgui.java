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
        jf.setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        name = new JLabel("NAME :");
        jf.add(name);

        n = new JTextField(10);
       
        jf.add(n);

        pass = new JLabel("PASSWORD: ");
        
        jf.add(pass);

        p = new JPasswordField(10);
        
        jf.add(p);

        details = new JLabel("DETAILS :");
        
        jf.add(details);

        d = new JTextField();
        
        jf.add(d);

        s = new JButton("SUBMIT");
        
        jf.add(s);

        r = new JButton("RESET");
        
        jf.add(r);

        s.addActionListener(this);
        r.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == s) {
            String s1 = "NAME :" + n.getText();
            String s2 = "PASSWORD" + String.valueOf(p.getPassword());
            d.setText(s1 + s2);
        } else if (e.getSource() == r) {
            d.setText("");
        }
    }

    public static void main(String[] args) {
        Formgui f = new Formgui();
    }
}
