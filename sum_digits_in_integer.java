import java.util.*;
public class sum_digits_in_integer 
{
    public static int sum_digits(int n)
    {
        int lastdigit, sum=0;
        while(n!=0)
        {
            lastdigit=n%10;
            sum+=lastdigit;
            n/=10;
        }
        return sum;
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER AN INTEGER NUMBER : ");
        int n=sc.nextInt();
        sc.close();
        System.out.println("THE SUM OF THE DIGITS OF "+n+" IS : "+sum_digits(n));
    }
}
