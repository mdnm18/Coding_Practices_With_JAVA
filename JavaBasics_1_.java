// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
/*
import java.util.*;
public class JavaBasics_1_
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER : ");
        int n=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        if(n%2==0)
        {
            for(evensum=0;evensum<=n;evensum++)
            {
                evensum+=n;
            }
            System.out.println("THE SUMMATION OF THE EVEN NUMBERS IS : "+evensum);
        }
        else
        {
            for(oddsum=0;oddsum<=n;oddsum++)
            {
                oddsum+=n;
            }
            System.out.println("THE SUMMATION OF THE ODD NUMBERS IS : "+oddsum);
        }
    }  
}
*/
import java.util.*;
public class JavaBasics_1_
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int choise;
        int evensum=0;
        int oddsum=0;
        do
        {
            System.out.print("ENTER YOUR NUMBER : ");
            n=sc.nextInt();
            if(n%2==0)
            {
                evensum+=n;
            }
            else
            {
                oddsum+=n;
            }
            System.out.print("Do you want to continue?\n Press 1 for yes or 0 for no : ");
            choise=sc.nextInt();
        }while(choise==1);
        System.out.println("THE SUMMATION OF THE EVEN NUMBERS IS : "+evensum);
        System.out.println("THE SUMMATION OF THE ODD NUMBERS IS : "+oddsum);
    }
}
