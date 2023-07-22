package Proj;
import java.util.Random;
public class Tester
{
    static String body;
    public static void main(String[] args)
    {
        Random rand = new Random();
        body=Integer.toString(rand.nextInt(10000));
        String body2="Your OTP is :"+body;
        SendEmail send = new SendEmail("daksha.kulkarni@cumminscollege.in", "Cabservices ",  body2 ); //change receiver email
    }
}