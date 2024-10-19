import java.io.*;
import java.util.*;
class VowelorCon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c=sc.nextLine().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        System.out.println("Vowel");
        else
        System.out.println("Consonant");
    }
}