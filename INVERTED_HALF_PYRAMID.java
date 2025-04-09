//PRINT INVERTED-HALF-PYRAMID WITH NUMBERS :
import java.util.*;
public class INVERTED_HALF_PYRAMID 
{
    public static void Inv_half_pyd(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=(n-i+1);j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE TOTAL NO. OF LINES : ");
        int n=sc.nextInt();
        sc.close();
        Inv_half_pyd(n);
    }   
}
