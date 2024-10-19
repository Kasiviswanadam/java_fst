import java.io.*;
import java.util.*;
import java.math.*;
class Triangle{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        float su=(a+b+c)/2;
        double area=Math.sqrt(su(su-a)*su(su-b)*su(su-c));
        System.out.println(area);

        if(a+b>c && a+c>b && b+c>a && a!=0 && b!=0 && c!=0)
        {  
             if(a==b && b==c)
            System.out.println("equilateral");
            else if (a==b || b== c || c==a)
            System.out.println("isosceles");
            else
            System.out.println("scalene");
        }
        else
        System.out.println("No");
    }
}