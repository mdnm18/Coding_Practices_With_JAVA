//print sum of first n natural numbers :
import java.util.*;
public class print_1_no
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int counter=1;
        int sum=0;
        System.out.println("ENTER THE LAST DIGIT OF YOUR NUMBER SERIES :");
        int n=sc.nextInt();
        sc.close();
        while(counter<=n)
        {
            sum+=counter;
            System.out.println("THE SUM OF NUMBERS BETWEEN 1 TO " +counter+ " : " +sum);
            counter++;
        }

    }
}



