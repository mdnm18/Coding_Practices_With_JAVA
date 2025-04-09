import java.util.*;
public class palindrome 
{
    public static boolean isPalindrome(int n)
    {
        int rev=0, lastdigit, original;
        original=n;
        while(n!=0)
        {
            lastdigit=n%10;
            rev=rev*10+lastdigit;
            n/=10;
        }
        if(original==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER AN INTEGER NUMBER :");
        int n=sc.nextInt();
        sc.close();
        String r=(isPalindrome(n))? n+" IS A PALINDROME NUMBER." : n+" IS NOT A PALINDROME NUMBER.";
        System.out.println(r);
    }  
}
