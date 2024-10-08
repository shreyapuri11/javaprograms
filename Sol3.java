import java.util.*;
import java.io.*;

class Pen{
    int id;
    String name;
    int rating;
    double price;

    Pen(int id, String name, int rating, double price){
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.price= price;
    }
}
public class Sol3 {
    public static Pen findDetailsWithMax(Pen[] arr){
        double max= 0.0;
        for(Pen k: arr){
            if(k.price>max){
                max=k.price;
            }
        }
        for(Pen k: arr){
            if(k.price==max){
                return k;
            }
        }
        return null;
    }

    public static Pen findDetailsWithName(Pen[] arr, String str){
        for(Pen k: arr){
            if(k.name.equalsIgnoreCase(str)){
                return k;
            }
        }
        return null;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pen[] arr = new Pen[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();

            arr[i]= new Pen(a,b,c,d);
        }

        String str = sc.nextLine();
        Pen ob1 = findDetailsWithMax(arr);
        Pen ob2 = findDetailsWithName(arr, str);
        if(ob1==null){
            System.out.println("No Match Found");
        }
        else{
            System.out.println(ob1.id);
            System.out.println(ob1.name);
            System.out.println(ob1.rating);
        }
        if(ob2==null){
            System.out.println("no match found");
        }
        else{
            System.out.println(ob2.id);
            System.out.println(ob2.name);
            System.out.println(ob2.rating);
        }
    }
    
}
