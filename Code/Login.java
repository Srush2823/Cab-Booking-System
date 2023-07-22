package Proj;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Login extends JFrame implements ActionListener
{
    JPanel panel;
    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3;
    JTextField pf1;
    JButton b1,b2,b3;
    static String e5;
    Login()
    {
        f = new JFrame("Login Account");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,580,350);
        l1.setLayout(null);

        l2 = new JLabel("LOGIN ACCOUNT");
        l2.setBounds(190,30,500,50);
        l2.setFont(new Font ("Airal",Font.BOLD,30));
        l2.setForeground(Color.BLACK);
        l1.add(l2);
        f.add(l1);

        l3 = new JLabel("EMAIL : ");
        l3.setBounds(120,120,150,30);
        l3.setForeground(Color.darkGray);
        l3.setFont(new Font ("Airal",Font.BOLD,20));
        l1.add(l3);

        b3 = new JButton("Get OTP");
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(120,170,150,30);

        t1 = new JTextField();
        t1.setBounds(320,120,190,30);
        l1.add(t1);

        pf1 = new JTextField();
        pf1.setBounds(320,170,150,30);
        l1.add(pf1);

        b1 = new JButton("Login");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(120,220,150,40);

        b2 = new JButton("Signup");
        b2.setBackground(Color.red);
        b2.setForeground(Color.white);
        b2.setBounds(320,220,150,40);

        l1.add(b1);
        l1.add(b2);
        l1.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addActionListener(this);

        f.setVisible(true);
        f.setSize(580,350);
        f.setLocation(300,100);
        f.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==b1)
        {
            if(pf1.getText()==Tester.body)
            {
                new Book_cab().setVisible(true);
                f.setVisible(false);
                //new Signup();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You have entered wrong OTP");
                f.setVisible(true);
            }
        }
        if(e.getSource()==b2)
        {
            f.setVisible(false);
            new Signup();
        }
        if(e.getSource()==b3)
        {
//            OTP CODE
            e5=t1.getText();
            System.out.println(e5);
            String body;
            Random rand = new Random();
            body=Integer.toString(rand.nextInt(10000));
            String body2="Your OTP is :"+body;
            SendEmail send = new SendEmail(e5, "Cabservices ",  body2 ); //change receiver email
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
}