package Proj;
import java.util.Random;
import java.util.Scanner;

public class Functionalities {

    static double Bill(double distance, String vehicleType) {
        double amount = 0.0;
        switch (vehicleType) {
            case "Auto":
                amount = distance * 10;
                break;
            case "Mini":
                amount = distance * 15;
                break;
            case "Prime SUV":
                amount = distance * 20;
                break;
            case "Prime Sedan":
                amount = distance * 20;
                break;
            case "Uber XL":
                amount = distance * 25;
                break;
        }
        return amount;
    }
    static double Time(double distance){
        double speed = distance/40;
        return speed * 60;
    }

    /*static HashMap<String, Integer> values = new HashMap<>();

    {
        values.put("Baner", 0);
        values.put("Bavdhan ", 1);
        values.put("Camp", 2);
        values.put("FC", 3);
        values.put("Hadapsar", 4);
        values.put("Karve Nagar", 5);
        values.put("Kothrud", 6);
        values.put("Swargate", 7);
        values.put("Peth", 8);
        values.put("Shivaji Nagar", 9);
    }*/
    static int loc=0,dest=0;
    /*public static void main(String[] args){
        Functionalities obj = new Functionalities();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
       *//* double dis[][] = new double[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                dis[i][j] = r.nextInt(20);
            }
        }*//*
        System.out.println("enter location: ");
        String location = sc.next();
        System.out.println("Enter destination node: ");
        String destination = sc.next();

        *//*for(int i=0;i<10;i++){
            if(MainGraph.value[i].equals(location))
                loc = i;
            if(MainGraph.value[i].equals(destination))
                dest=i;
        }*//*

        //obj.Bill(dist,"Car");
    }*/
}
