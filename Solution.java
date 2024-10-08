import java.util.*;
import java.io.*;

class Shoe{
    int batchnum;
    String type;
    int size;
    double price;

    Shoe(int batchnum, String type, int size, double price){
        this.batchnum= batchnum;
        this.type=type;
        this.size= size;
        this.price=price;
    }
}

public class Solution{

    public static Shoe getShoeByType(Shoe[] arr, String t){
        for(Shoe k: arr){
            if(k.type.equalsIgnoreCase(t)){
                return k;
            }
        }
        return null;
       }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Shoe [] arr = new Shoe[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();

            arr[i] = new Shoe(a,b,c,d);
        }
       String t = sc.nextLine();
       Shoe ob = getShoeByType(arr,t);
       if(ob != null){
        System.out.println(ob.batchnum);
        System.out.println(ob.type);
        System.out.println(ob.size);
        System.out.println(ob.price);
       }
       else{
        System.out.println("No shoe found");
       }
       
    }   
}






























