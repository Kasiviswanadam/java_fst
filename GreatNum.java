import java.io.*;
import java.util.*;
import java.math.*;
class GreatNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=sc.nextInt();
        int result=c>(a>b?a:b)?c:(a>b?a:b);
        
        System.out.println(result);
        
    }
}