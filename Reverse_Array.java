import java.util.*;
public class Reverse_Array 
{
    public static void Reverse(int a[])
    {
        int start=0, end=a.length-1;
        while(start<end)
        {
            int temp=a[end];
            a[end]=a[start];
            a[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY : ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("THE REVERSE FORM OF THE GIVEN ARRAY IS : ");
        Reverse(a);
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+"\n");
        }
        System.out.println();
        sc.close();
    }
}
