package java_examples;
import java.util.*; 
public class java1 {
    public static void main(String[] args) {
        //take radius of circle , calculate area and print 
        Scanner sc = new Scanner (System.in);
        double r = sc.nextDouble();
        double Area = Math.PI*(r*r);
        System.out.println(Area);
        sc.close();
    }    
}
