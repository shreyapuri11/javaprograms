import java.util.*;
import java.io.*;

class Student{
    int rNo;
    String name;
    int subject;
    double fees;

    Student(int rNo, String name, int subject, double fees){
        this.rNo = rNo;
        this.name = name;
        this.subject = subject;
        this.fees = fees;
    }
}
public class sol5 {
 public static Student getDataWithMinFees(Student[] arr){
    double min = 0.0;
    for(Student k: arr){
        if(k.fees < min){
            min = k.fees;
        }
    }
    for(Student k: arr){
        if(k.fees == min){
            return k;
        }
    }
    return null;
 }

 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Student arr[] = new Student[4];
    for(int i=0; i<4; i++){
        int a = sc.nextInt(); sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt(); sc.nextLine();
        double d = sc.nextDouble(); sc.nextLine();

        arr[i] = new Student(a,b,c,d);
    }
    Student ob = getDataWithMinFees(arr);
    if(ob==null){
        System.out.println("No Match found");
    }
    else{
        System.out.println(ob.rNo);
        System.out.println(ob.name);
        System.out.println(ob.subject);
        System.out.println(ob.fees);
    }
 }
}
