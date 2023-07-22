package Proj;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener
{
    static JFrame f1;
    static JLabel l1,l2,l3;
    static JTextField t1,t2,t3;
    JPasswordField p1;
    JButton b1,b2;

    public Signup()
    {
        f1 = new JFrame("Create New Account");
        f1.setBackground(Color.WHITE);
        f1.setLayout(null);

        l1 = new JLabel("Name");
        l1.setBounds(40,20,100,30);
        f1.add(l1);

        l2 = new JLabel("Email ID");
        l2.setBounds(40,70,100,30);
        f1.add(l2);

        l3 = new JLabel("PhoneNo.");
        l3.setBounds(40,120,100,30);
        f1.add(l3);

        t1 = new JTextField();
        t1.setBounds(150,20,200,30);
        f1.add(t1);

        t2 = new JTextField();
        t2.setBounds(150,70,200,30);
        t2.setText(Login.e5);
        f1.add(t2);

        t3 = new JTextField();
        t3.setBounds(150,120,200,30);
        f1.add(t3);

        b1 = new JButton("Sign up");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(40,200,120,30);

        b2 = new JButton("Back");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(180,200,120,30);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f1.add(b1);
        f1.add(b2);

        f1.getContentPane();
        f1.setVisible(true);
        f1.setSize(550,300);
        f1.setLocation(400,300);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Book_cab().setVisible(true);
            this.f1.setVisible(false);
        }
        if(e.getSource()==b2)
        {
            this.f1.setVisible(false);
        }
    }

}