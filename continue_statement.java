//DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10 THAT WILL BE SKIP :
import java.util.*;
public class continue_statement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("ENTER YOUR NUMBER : ");
            int n=sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println(n);
        }  
    }  
}
