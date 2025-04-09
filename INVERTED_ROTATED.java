// PRINT INVERTED & ROTATED HALF-PYRAMID :
import java.util.*;
public class INVERTED_ROTATED 
{
    public static void In_Ro_ha_Py(int n)
    {
        for(int row=1; row<=n; row++)
        {
            // Print Space :
            for(int space=1; space<=(n-row);space++ )
            {
                System.out.print(" ");
            }
            // Print Stars :
            for(int stars=1; stars<=row;stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("ENTER THE TOATAL NO. OF LINES : ");
        int n=sc.nextInt();
        In_Ro_ha_Py(n);
    }
}
