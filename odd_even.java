//USING IF-ELSE STATEMENT :
/* 
import java.util.*; 
public class odd_even 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK ODD-EVEN NUMBER :");
        int a=sc.nextInt();
        sc.close();
        if(a%2==0)
        {
            System.out.println("THE NUMBER THAT YOU HAVE ENTERED IS AN EVEN NUMBER.");
        }
        else
        {
            System.out.println("THE NUMBER THAT YOU HAVE ENTERED IS AN ODD NUMBER.");
        }
    }
}
*/
// 
// USING TERNARY(?) OPERATOR :
// import java.util.*; 
// public class odd_even 
// {
    // public static void main(String args[])
    // {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("ENTER A NUMBER TO CHECK ODD-EVEN NUMBER :");
        // int a=sc.nextInt();
        // sc.close();
        // String r=((a%2)==0)? "THE NUMBER THAT YOU HAVE ENTERED IS AN EVEN NUMBER" : "THE NUMBER THAT YOU HAVE ENTERED IS AN ODD NUMBER" ;
        // System.out.println(r);
// 
    // }
// }

import java.util.*;
public class odd_even
{
    public static boolean isEven(int number) 
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A INTEGER NUMBER :");
        int n=sc.nextInt();
        sc.close();
        if(isEven(n))
        {
            System.out.println(n+" IS AN EVEN NUMBER.");
        }
        else
        {
            System.out.println(n+" IS AN ODD NUMBER.");
        }
    }
}










