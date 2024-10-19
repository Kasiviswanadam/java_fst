/*import java.io.*;
import java.util.*;
import java.math.*;


class Arm{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int d=String.valueOf(n).length();
    int r=0;
    while (n!=0) {
        n=n%10;
    
        r=r+ (int)Math.pow(r,d);
    
        n=n/10;
    }
    System.out.println(r);
   
  }
}*/
import java.io.*;
import java.util.*;
import java.math.*;

class Arm {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int d = String.valueOf(n).length();
    int r = 0;
    int temp = n; // store the original value of n
    while (temp != 0) {
        int digit = temp % 10; // get the last digit
        r += Math.pow(digit, d); // add the digit raised to the power of d to r
        temp /= 10; // remove the last digit
    }
    System.out.println(r);
    if (r == n) {
        System.out.println("The number is an Armstrong number.");
    } else {
        System.out.println("The number is not an Armstrong number.");
    }
  }
}