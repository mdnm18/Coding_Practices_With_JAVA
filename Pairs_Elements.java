import java.util.*;
public class Pairs_Elements 
{
    public static void printpairs(int a[])
    {
        int tp=0;
        for(int i=0; i<a.length; i++)
        {
            int current_index=a[i];
            for(int j=i+1; j<a.length; j++)
            {
                System.out.print("("+current_index+","+a[j]+") " );
                tp++;
            }
            System.out.println();
        }
        System.out.println("TOTAL NUMBER OF ELEMENTS' PAIR : "+tp);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF ARRAY : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("ENTER THE ELEMENTS OF ARRAY : ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("THE PAIRS OF ELEMENTS ARE : ");
        printpairs(a);
        sc.close();
    }
}
