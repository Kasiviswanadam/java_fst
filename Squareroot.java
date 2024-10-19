import java.io.*;
import java.util.*;
import java.math.*;
class Squareroot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a coefficient of X^2");
        int a=sc.nextInt();
        System.out.println("Enter a coefficient of X");
        int b=sc.nextInt();
        System.out.println("Enter a constant");
        int c=sc.nextInt();
        double d = b*b-4*a*c;
        if(d<0)
        System.out.println("Imaginary roots");
        else if(d==0)
        System.out.println("Equal roots");
        else
        System.out.println("Distinct roots");
        System.out.println("The roots of " +a+"x^2+" +b+ "x+" +c+ "=0 are");
        double root1 = (-b + Math.sqrt(d)) / (2 * a);
        double root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Root 1: " +root1);
        System.out.println("Root 2: " +root2);

    }
}