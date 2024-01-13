package java_examples;
import java.util.*;
public class java3 {
    public static void main(String[] args) {
        //Calculator
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        System.out.println("Addition = " + add );
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Modulo or Reaminder = " + mod);
        sc.close();

    }
    
}
