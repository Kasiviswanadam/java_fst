import java.util.Scanner;
class Grade{
    public static void main(String[] args){
        char gr;
        int m=40;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>m)
        {
            if(n>90)
                gr='A';
            else if(n>80)
                gr='B';
            else gr='c';
        }
        else gr='F';
        System.out.println(gr);


    }
}