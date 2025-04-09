/*
import java.util.*;
public class prime_no_range 
{
    public static void prime(int n)
    {
        if(n<=n)
        {
            System.out.print("ENTERED NUMBER IS A PRIME NUMBER.");
        }
        else
        {
            String isprime=" ";
            for(int i=2;i<=n;i++)
            {
                isprime=(n%2==0)?"ENTERED NUMBER IS A NON-PRIME NUMBER.":"ENTERED NUMBER IS A PRIME NUMBER";
            }
            System.out.print(isprime);
        }
    }
    public static void primeInRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(prime(i))
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE LAST DIGIT OF YOUR PRIME NUMBER SERIES : ");
        int n=sc.nextInt();
        System.out.print("THE PRIME NUMBER SERIES THAT IN BETWEEN 2 TO "+n+" IS : ");
        primeInRange(n);
    }
}
*/
import java.util.*;
public class prime_no_range 
{
    // Method to check if a number is prime
    public static boolean prime(int n)
     {
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    // Method to print all prime numbers in a given range
    public static void primeInRange(int n)
    {
        for (int i = 2; i <= n; i++) 
        {
            if (prime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();  // This ensures the next line prints on a new line
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE LAST DIGIT OF YOUR PRIME NUMBER SERIES: ");
        int n = sc.nextInt();
        System.out.print("THE PRIME NUMBER SERIES THAT IS IN BETWEEN 2 TO " + n + " IS: ");
        primeInRange(n);
        sc.close();  // Close the scanner
    }
}





