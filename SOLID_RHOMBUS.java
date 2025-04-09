// SOLID RHOMBUS :
import java.util.*;
public class SOLID_RHOMBUS 
{
    public static void S_R(int n)
    {
        for(int i=1; i<=n; i++)
        {
            // Space : (n-i)
            for(int j=1; j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            // Stars : n
            for(int j=1; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("ENTER THE TOTAL NUMBER OF LINES : ");
        int n=sc.nextInt();
        sc.close();
        S_R(n);
    }
}
