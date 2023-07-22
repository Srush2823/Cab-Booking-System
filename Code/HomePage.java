package Proj;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener
{
    JLabel l1;
    Font f,f1,f2;
    JPanel p1,p2;

    HomePage()
    {
        super("Cab Booking Home Page");
        setLocation(0,0);
        setSize(1550,800);

        f = new Font("Prime Sedan",Font.BOLD,20);
        f2 = new Font("Prime SUV",Font.BOLD,35);
        f1 = new Font("Swift",Font.BOLD,18);

        JMenuBar m1 = new JMenuBar();

        JMenu men1 = new JMenu("Customer Profile");
        JMenuItem ment1 = new JMenuItem("View Customer Profile");

        JMenu men2 = new JMenu("Book Cab");
        JMenuItem ment2 = new JMenuItem("Book cab");
        JMenuItem ment3 = new JMenuItem("View Booked cab");

        JMenu men3 = new JMenu("Bill");
        JMenuItem ment4 = new JMenuItem("Check Bill");

        JMenu men4 = new JMenu("About");
        JMenuItem ment5 = new JMenuItem(" Info ");
        JMenuItem ment6 = new JMenuItem(" Exit ");

        men1.add(ment1);
        men2.add(ment2);
        men2.add(ment3);
        men3.add(ment4);
        men4.add(ment5);
        men4.add(ment6);

        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);

        ment1.addActionListener(this);
        ment2.addActionListener(this);
        ment3.addActionListener(this);
        ment4.addActionListener(this);
        ment5.addActionListener(this);
        ment6.addActionListener(this);

        m1.setBackground(Color.black);

        men1.setForeground(Color.gray);
        men2.setForeground(Color.gray);
        men3.setForeground(Color.gray);
        men4.setForeground(Color.red);

        ment1.setBackground(Color.black);
        ment2.setBackground(Color.black);
        ment3.setBackground(Color.black);
        ment4.setBackground(Color.black);
        ment5.setBackground(Color.black);
        ment6.setBackground(Color.black);

        ment1.setForeground(Color.yellow);
        ment2.setForeground(Color.yellow);
        ment3.setForeground(Color.yellow);
        ment4.setForeground(Color.yellow);
        ment5.setForeground(Color.red);
        ment6.setForeground(Color.red);

        setJMenuBar(m1);
        add(m1);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if(command.equals("Customer Profile"))
        {
            //new ViewCustomer().setVisible(true);
        }
        else if(command.equals("Book Cab"))
        {
            new Book_cab().setVisible(true);
        }
//
        else if(command.equals("Exit"))
        {
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        new HomePage().setVisible(true);
    }
}