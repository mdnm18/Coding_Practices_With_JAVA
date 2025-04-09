//PRINT FLOYD'S TRIANGLE :
import java.util.*;
public class FLOYD_TRIANGLE 
{
    public static void floyd_triangle(int n)
    {
        int counter=01;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(counter+" ");
                counter++;
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
       floyd_triangle(n);
    }
}
