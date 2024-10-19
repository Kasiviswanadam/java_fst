import java.io.*;
import java.util.*;
class Divis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=n%5;
        System.out.println(r);
        if(n%5==0 && n%11==0){
            System.out.println("Divisible" +n);
            }
            else{
                System.out.println("Not Divisible" +n);
        }
    }
}