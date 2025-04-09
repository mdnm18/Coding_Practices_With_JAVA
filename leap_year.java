import java.util.*;
public class leap_year
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A YEAR TO CHECK IT'S TYPE- LEAP YEAR OR NON-LEAP YEAR :");
        int year=sc.nextInt();
        sc.close();
        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=((year%100)==0 && (year%400)==0);
        String r=(x && (y||z)? "ENTERED YEAR IS LEAP YEAR" : "ENTERED YEAR IS NON-LEAP YEAR");
        System.out.println(r);
    }
}