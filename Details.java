import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Details extends JFrame implements ActionListener {
    JFrame jf;
    JButton submit,exit;
    JRadioButton male,female;
    JComboBox cplace;
    JCheckBox music,swimming;
    JLabel name,gender,interest,fav,details;
    JTextField name1;
    JTextArea details1;
    ButtonGroup g;
    
    Details()
    {
        jf=new JFrame("FORM ");
        jf.setBounds(200,80,600,700);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);

        submit=new JButton("SUBMIT");
        exit=new JButton("EXIT");
        name=new JLabel("NAME:");
        name.setSize(100,20);
        name.setLocation(100, 100);
        jf.add(name);

        name1=new JTextField();
        name1.setSize(190, 20);
        name1.setLocation(200, 100);
        jf.add(name1);
        gender=new JLabel("GENDER ");
        gender.setSize(100, 20);
        gender.setLocation(100, 150);
        jf.add(gender);
        male=new JRadioButton("MALE");
        male.setSize(80,20);
        male.setLocation(200,150);
        jf.add(male);
        female=new JRadioButton("FEMALE");
        female.setSize(80,20);
        female.setLocation(300, 150);
        jf.add(female);
        g=new ButtonGroup();
        g.add(male);
        g.add(female);

        interest=new JLabel("INTEREST");
        interest.setSize(100,20);
        interest.setLocation(100, 200);
        jf.add(interest);
        music=new JCheckBox("MUSIC");
        music.setSize(80,20);
        music.setLocation(200, 200);
        jf.add(music);

        swimming=new JCheckBox("SWIM");
        swimming.setSize(80, 20);
        swimming.setLocation(280, 200);
        jf.add(swimming);

        fav=new JLabel("FAV PLACE");
        fav.setSize(100,20);
        fav.setLocation(100, 300);
        jf.add(fav);

        cplace=new JComboBox();
        cplace.setSize(150,20);
        cplace.setLocation(200,300);
        jf.add(cplace);
        cplace.addItem("INDIA");
        cplace.addItem("usa");
        cplace.addItem("kuch nhi ");

        details=new JLabel("DETAILS");
        details.setSize(80,20);
        details.setLocation(100, 400);
        jf.add(details);

        details1=new JTextArea();
        details1.setSize(200, 100);
        details1.setLocation(200, 400);
        details1.setLineWrap(true);
        details1.setEditable(false);
        jf.add(details1);

        submit.setSize(100,20);
        submit.setLocation(150, 550);
        submit.addActionListener(this);
        jf.add(submit);

        exit.setSize(100,20);
        exit.setLocation(270, 550);
        exit.addActionListener(this);
        jf.add(exit);
        jf.setVisible(true);


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submit)
        {
            String data="NAME: "+name1.getText()+"\n"+"GENDER:"+(male.isSelected()==true?"MALE":"FEMALE")+"\n"+"INTEREST:"+(music.isSelected()==true?"MUSIC":"SWIMMING")+"\n"+"FAV PLACE: "+cplace.getItemAt(cplace.getSelectedIndex());
            details1.setVisible(true);
            details1.setText(data);
        }
        else if(e.getSource()==exit)
        {
         details1.setText("BYE BHAI");
        }
    }
    public static void main(String[] args) {
        Details d=new Details();
    }
}
