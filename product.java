import java.util.*;
public class product 
{
    public static void products(int a,int b)
    {
        int p=a*b;
        System.out.println("THE PRODUCT BETWEEN "+a+" AND "+b+" IS : "+p);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int a=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int b=sc.nextInt();
        products(a,b);
    }
}
