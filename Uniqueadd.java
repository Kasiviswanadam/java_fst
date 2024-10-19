import java.io.*;
import java.util.*;
class Uniqueadd
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter n");
        n=s.nextInt();
        int[] a=new int[20];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            while (j<n) 
            {   
                
                if(a[j]==a[i])
                {
                    break;
                    
                }j++;  
            }
            if(j==n)
                {
                    sum+=a[i];
                }
        }
        System.out.println(sum);
    }
}