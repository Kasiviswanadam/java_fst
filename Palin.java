import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Palin{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String r="";
        String a=s.nextLine();
        int l=a.length();
        for(int i=0;i<l/2;l++)
        if(a.charAt(i)==a.charAt(l-i-1))
        {
            System.out.println("palin");

        }
        else{
            System.out.println("not");
        }
        /*for(int i=0;i<l/2;i++)
        {
            if(a.charAt(i)==a.charAt(l-i-1))
            {
                r="palin";
                }
                else
                {
                    r="not";
                }
        }
        System.out.println(r);*/

    }
}