import java.util.*;
import java.io.*;

class Employee {
    int id;
    String name;
    int task;
    double salary;

    Employee(int id, String name, int task, double salary ){
        this.id = id;
        this.name = name;
        this.task = task;
        this.salary = salary;
    }
}
public class Sol4 {
    public static double getAvgSalary(Employee[] arr){
        double sum = 0.0;
        double count = 0.0;
        for(Employee k: arr){
            sum += k.salary;
            count++;
        }
        return sum/count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[4];
        for(int i=0; i<4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();

            arr[i] = new Employee(a,b,c,d);
        }
        
        double avg = getAvgSalary(arr);
        
        if(avg==0){
            System.out.println("No Elements");
        }
        else{
            System.out.println(avg);
        }
    }
}
