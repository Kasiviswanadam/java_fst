import java.util.*;
import java.io.*;
import java.lang.*;
public class Array
{
    public static void main(String[] args)
    {
        
        int[] a={11,12,21,22,31,32};
        int al=a.length;
        int b[]=new int[6];
        
       
       int j=0;
        for(int i=0;i<al;i+=2)
        {
            b[j]=a[i];
            j++;
            
        }
        for(int i=1;i<al;i+=2){
            b[j]=a[i];
            j++;
            
        }
        for (int i=0;i<al;i++){
        System.out.print(b[i]+" ");}
    }
}