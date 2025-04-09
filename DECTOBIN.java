import java.util.*;
public class DECTOBIN
{
    public static void Dec_Bin(int n)
    {
        int mynum=n, reminder, binnary=0, pow=0;
        while(n!=0)
        {
            reminder=n%2;
            binnary+=reminder*(int)Math.pow(10,pow);
            n/=2;
            pow++;
        }
        System.out.print("THE BINNARY FORM OF "+mynum+" IS : "+binnary);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A DECIMAL NUMBER : ");
        int n=sc.nextInt();
        Dec_Bin(n);
    }
}
