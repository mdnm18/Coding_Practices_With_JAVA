//PRINT REVERSE FORM OF A NUMBER :
import java.util.*;
public class reverse_no 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO GENERATE IT'S REVERSE FORM :");
        int n=sc.nextInt();
        sc.close();
        int lastdigit;
        int rev=0;
        System.out.println("THE REVERSE FORM OF YOUR ENTERED NUMBER IS :");
        while(n>0)
        {
            lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            //System.out.print(lastdigit);
            n/=10;
        }
        System.out.println(rev);
    }
}
