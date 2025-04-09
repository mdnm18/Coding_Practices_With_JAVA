// Butter Fly Pattern :
import java.util.*;
public class BUTTERFLY 
{
    public static void butter_fly(int n)
    {
        //1st Half :
        for(int i=1; i<=n; i++)
        {
            // Stars print -> i;
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            // Space print -> 2*(n-i);
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            // Stars print -> i;
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half :
        for(int i=n; i>=1; i--)
        {
            // Stars print -> i;
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            // Space print -> 2*(n-i);
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            // Stars print -> i;
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("ENTER THE TOTAL NO. OF LINES FOR THE FIRST HALF OF THE BUUTER-FLY PATTERN : ");
        int n=sc.nextInt();
        sc.close();
        butter_fly(n);
    }
}

