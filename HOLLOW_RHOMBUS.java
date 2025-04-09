// HOLLOW RHOMBUS :
import java.util.*;
public class HOLLOW_RHOMBUS 
{
    public static void hollow_rhombus(int n)
    {
        for(int i=1; i<=n; i++)
        {
            // Space : (n-i)
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            // Stars : (Hollow ractangle concept)
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("ENTER TOTAL NO. OF LINES : ");
        int n=sc.nextInt();
        sc.close();
        hollow_rhombus(n);
    }  
}
