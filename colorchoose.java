//dropdown to chosse colour and display selected one
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class colorchoose extends JFrame implements ActionListener{
    JFrame jf;
    JComboBox c;
    JTextField display;
    JLabel colour,disp;
    JButton submit;
    colorchoose()
    {
        jf=new JFrame("CHOOSE COLOUR");
        c=new JComboBox<>();
        c.setSize(200,20);
        c.addItem("GREEN");
        c.addItem("RED");
        c.addItem("PINK");
        display=new JTextField(20);
        display.setSize(80,20);
        colour=new JLabel("COLOUR: ");
        colour.setSize(80,20);
        disp=new JLabel("DETAILS : ");
        disp.setSize(80,20);
        submit=new JButton("SUBMIT");
        this.add(colour);
        this.add(c);
        this.add(disp);
        this.add(display);
        this.add(submit);
        submit.addActionListener(this);
        setSize(500,235);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submit)
        {
            String s1=(String) c.getItemAt(c.getSelectedIndex());
            display.setText("COLOUR CHOSE : "+s1);
            

        }
    }
    public static void main(String[] args) {
        colorchoose c=new colorchoose();

    }
}
