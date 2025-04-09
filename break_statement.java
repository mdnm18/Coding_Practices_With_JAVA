//DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10 THAT WILL BREAK WHOLE WORK:
import java.util.*;
public class break_statement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print ("ENTER YOUR NUMBER : ");
            int n=sc.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
