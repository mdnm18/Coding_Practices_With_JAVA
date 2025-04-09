// Write a program to find the factorial of any number entered by the user.
/*
import java.util.*;
public class factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER : ");
        double n=sc.nextDouble();
        double f=1;
        for(double i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.print("THE FACTORIAL OF "+n+" IS : "+f);
    }
}
    */
import java.util.*;
public class factorial
{
    public static int facto(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER : ");
        int n=sc.nextInt();
        System.out.println("THE FACTORIAL OF "+n+" IS : ");
        System.out.println(facto(n));
    }
}
