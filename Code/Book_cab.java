package Proj;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Book_cab extends JFrame implements ActionListener {
    JPanel p1, p2;
    JButton bt1, bt2,lab1;
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;
    static JLabel l4;
    static JLabel l5;
    static JLabel l6;
    static JLabel l7;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6,tf7;

    Font f, f1;
    static Choice ch1, ch2, ch3,ch4;

    Book_cab() {
        super("Book Cab");
        setLocation(50, 10);
        setSize(1000, 600);

        f = new Font("Arial", Font.BOLD, 25);
        f1 = new Font("Arial", Font.BOLD, 18);

        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();
        ch4 = new Choice();

        // CODE
        ch1.add("Baner");
        ch1.add("Bavdhan");
        ch1.add("Camp");
        ch1.add("FC");
        ch1.add("Hadapsar");
        ch1.add("Karve Nagar");
        ch1.add("Kothrud");
        ch1.add("Swargate");
        ch1.add("Peth");
        ch1.add("Shivaji Nagar");

        ch2.add("Baner");
        ch2.add("Bavdhan");
        ch2.add("Camp");
        ch2.add("FC");
        ch2.add("Hadapsar");
        ch2.add("Karve Nagar");
        ch2.add("Kothrud");
        ch2.add("Swargate");
        ch2.add("Peth");
        ch2.add("Shivaji Nagar");

        ch4.add("Auto");
        ch4.add("Mini");
        ch4.add("Prime SUV");
        ch4.add("Prime Sedan");
        ch4.add("Uber XL");

        l1 = new JLabel("       Book Cab");
        l2 = new JLabel("       Book ID");
        l3 = new JLabel("       Name");
        l4 = new JLabel("       Pickup");
        l5 = new JLabel("       Destination");
        l6 = new JLabel("       Cab");
        l7 = new JLabel("       Distance");

        String s = l4.getText();

        l1.setHorizontalAlignment(JLabel.CENTER);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();

        tf1.setEditable(false);
        tf2.setEditable(false);

        bt1 = new JButton("     Book Cab");
        bt2 = new JButton("     Back");
        lab1 = new JButton("     Cost");

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        lab1.addActionListener(this);

        bt1.setBackground(Color.yellow);
        bt2.setBackground(Color.red);

        bt1.setForeground(Color.black);
        bt2.setForeground(Color.white);

        Random ram = new Random();
        tf1.setText("" + Math.abs(ram.nextInt() % 100000));
        tf1.setForeground(Color.red);

        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        l7.setFont(f1);
        ch1.setFont(f1);
        ch2.setFont(f1);
        ch3.setFont(f1);
        ch4.setFont(f1);

        tf1.setFont(f1);
        tf2.setFont(f1);
        tf3.setFont(f1);
        tf4.setFont(f1);
        tf5.setFont(f1);
        tf6.setFont(f1);
        tf7.setFont(f1);

        bt1.setFont(f1);
        bt2.setFont(f1);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1, 9, 9));
        p1.add(l1);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(8, 2, 8, 8));

        p2.add(l2);
        p2.add(tf1);
        p2.add(l4);
        p2.add(ch1);
        p2.add(l5);
        p2.add(ch2);
        p2.add(l3);
        p2.add(tf3);
        p2.add(l6);
        p2.add(ch4);
        p2.add(l7);
        p2.add(tf7);
        p2.add(lab1);
        p2.add(tf6);
        p2.add(bt1);
        p2.add(bt2);


        setLayout(new BorderLayout(10, 10));
        add(p1, "North");
        add(p2, "Center");

        tf3.setText(Signup.t1.getText());
    }
    static String ti;
    static int a1;
    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getSource()==lab1)
        {
            MainGraph.Edges();
            double dist = Dijkstra.dijkstra(MainGraph.Matrix,ch1.getSelectedIndex(),ch2.getSelectedIndex());
            System.out.println("Distance = "+dist);
            double bill = Functionalities.Bill(dist,ch4.getSelectedItem());
            String t = Double.toString(bill);
            double tim = Functionalities.Time(dist);
            a1 = (int) tim;
            System.out.println(a1);
            ti = Double.toString(tim);
            System.out.println("time: "+a1);
            tf6.setText("Rs. "+t);
            tf7.setText((dist)+" Km");
        }

        if(e.getSource()==bt2)
        {
            p1.setVisible(false);
            p2.setVisible(false);
        }
        if(e.getSource()==bt1)
        {
            p2.setVisible(false);
            p1.setVisible(false);

            new Time().setVisible(true);
        }
    }
    public static void main (String[]args)
    {
        new Book_cab().setVisible(true);
    }
}