import java.util.*;
public class DIAMOND 
{
    public static void diamond(int n)
    {
        // 1st Half :
        for(int i=1; i<=n; i++)
        {
            // Space : (n-i)
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            // Stars : (i) INVERTED & ROTATED HALF-PYRAMID
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            // Stars : (i) HALF-PYRAMID PATTERN :
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half : 
        for(int i=n; i>=1; i--)
        {
            // Space : (n-i)
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            // Stars : (i) INVERTED & ROTATED HALF-PYRAMID
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            // Stars : (i) HALF-PYRAMID PATTERN :
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE TOTAL NUMBER OF LINES : ");
        int n=sc.nextInt();
        sc.close();
        diamond(n);
    }
}
