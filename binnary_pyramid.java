// PRINT 0-1 TRIANGLE :
import java.util.*;
public class binnary_pyramid 
{
    public static void bin_tri(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE TOTAL NO. OF LINE : ");
        int n=sc.nextInt();
        sc.close();
        bin_tri(n);
    }
}
