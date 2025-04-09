import java.util.*;
public class Binary_Search 
{
    public static int B_S(int a[], int key)
    {
        int start=0, end=a.length-1;
        while(start<=end)
        {
             int mid=start+(end-start)/2; // PREVENTS OVERFLOW; 
            if(a[mid]==key)
            {
                return mid;
            }
            else if(a[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY : ");
        int size=sc.nextInt();
        int a[]=new int [size];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY : ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print("ELEMENT -"+ i +" : ");
            a[i]=sc.nextInt();
        }
        System.out.print("ENTER THE ELEMENT WHOSE INDEX YOU WANT TO FIND : ");
        int key=sc.nextInt();
        int result=B_S(a,key);
        if(result==-1)
        {
            System.out.print(key+" NOT FOUND IN THE ARRAY !");
        }
        else
        {
            System.out.println("INDEX OF " + key + " IS: " + result);
        }
        sc.close();
    }
}
