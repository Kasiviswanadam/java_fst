import java.io.*;
import java.util.*;
class Isnd
{
    public static void main(String[] args){
    {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(c>='a' && c<='z')
        System.out.println("Alphabet");
        else if(c>='A' && c<='Z')
        System.out.println(" big Alphabet");
        else if(c>='0' || c<='0')
        System.out.println("number");
        else
        System.out.println("special character");

    } 
    }
}