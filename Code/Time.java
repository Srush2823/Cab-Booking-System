package Proj;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Time extends JFrame
{
    static JFrame f11;
    static JLabel l1,l2,l3,l4;
    static JTextField t22,t21;
    String taxiNo[] = new String[10];
    static Random r = new Random();
    {
        taxiNo[0] = "MH 12 4092";
        taxiNo[1] = "MH 12 6984";
        taxiNo[2] = "MH 12 2518";
        taxiNo[3] = "MH 12 4519";
        taxiNo[4] = "MH 12 3702";
        taxiNo[5] = "MH 12 1635";
        taxiNo[6] = "MH 12 8290";
        taxiNo[7] = "MH 12 7452";
        taxiNo[8] = "MH 12 4388";
        taxiNo[9] = "MH 12 6264";
    }
    Time()
    {
        f11 = new JFrame("On its way");
        f11.setBackground(Color.black);
        f11.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,580,350);
        l1.setLayout(null);

        l2 = new JLabel("On its way");
        l2.setBounds(190,20,500,50);
        l2.setFont(new Font ("Airal",Font.BOLD,30));
        l2.setForeground(Color.black);
        l1.add(l2);


        f11.setVisible(true);
        f11.setSize(580,350);
        f11.setLocation(300,100);
        f11.setResizable(false);

        l3 = new JLabel(" Time : ");
        l3.setBounds(120,220,150,30);
        l3.setForeground(Color.darkGray);
        l3.setFont(new Font ("Airal",Font.BOLD,30));
        l1.add(l3);

        t22 = new JTextField();
        t22.setBounds(240,220,150,35);
        f11.add(t22);
        t22.setFont(new Font("Airal",Font.PLAIN,20));
        t22.setText(Book_cab.a1+" Minutes");

        l4 = new JLabel(" Cab No:  ");
        l4.setBounds(120,170,150,30);
        l4.setForeground(Color.darkGray);
        l4.setFont(new Font ("Airal",Font.BOLD,30));
        l1.add(l4);

        t21 = new JTextField();
        t21.setBounds(260,170,150,35);
        f11.add(t21);
        t21.setFont(new Font("Airal",Font.PLAIN,20));
        t21.setText(taxiNo[r.nextInt(9)]);

       /*t21 = new JTextField();
       t21.setBounds(180,200,150,35);
       f11.add(t21);*/

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("Proj/Icons/taxi1.jpg"));
        Image i1 = i.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel a = new JLabel(i2);
        a.setBounds(20,60,120,100);
        f11.add(a);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("Proj/Icons/images.png"));
        Image i4 = i3.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel a2 = new JLabel(i5);
        a2.setBounds(400,60,120,100);
        f11.add(a2);

        JLabel line = new JLabel("-   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -    -   -  -  -");
        line.setBounds(100,110,510,30);
        line.setForeground(Color.black);
        l1.add(line);

        f11.add(l1);
        f11.getContentPane();
        f11.setVisible(true);
        f11.setSize(550,300);
        f11.setLocation(400,300);
    }

    public static void main(String[] args)
    {
        new Time();
    }
}