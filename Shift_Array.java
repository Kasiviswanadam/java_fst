

import java.io.*;
public class Shift_Array 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,10,20,30};
		int[] b = {0,0,0,0,0,0};
	    int j=0;
	    for(int i=0;i<a.length/2;i++) 
	    {
	            b[j]=a[i];
	            j+=2;
	    }
	    j=1;
	    for(int i=a.length/2;i<a.length;i++) 
	    {
	            b[j]=a[i];
	            j+=2;  
	    }
	    for(int i=0;i<b.length;i++)
	    {
	    	System.out.print(b[i]+" ");
	    }
	}

}