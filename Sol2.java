import java.util.*;
import java.io.*;

class Bus{
    int id;
    int seats;
    double fare;
    String city;

    Bus(int id, int seats, double fare, String city){
        this.id = id;
        this.seats=seats;
        this.fare = fare;
        this.city = city;
    }
}
public class Sol2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bus[] arr = new Bus[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt(); sc.nextLine();
            int b = sc.nextInt(); sc.nextLine();
            double c = sc.nextDouble(); sc.nextLine();
            String d = sc.nextLine();
            
            arr[i] = new Bus(a,b,c,d);
        }
        double ans = Sol2.findAverageBusFare(arr);
        System.out.println("Average: "+ ans);
    }
    public static double findAverageBusFare(Bus[] arr){
        double s=0, c=0;
        for(Bus k : arr){
            s += k.fare;
            c++;
        }
        double avg = s/c;
        return avg;
    }
    
}
