import java.util.*;
public class remainder_calculate 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be divided : ");
        int dividend =sc.nextInt();
        System.out.println("Enter the number by which to divide : ");
        int divisor=sc.nextInt();

        int quotient = dividend / divisor; // Calculates the quotient
        int remainder = dividend % divisor; // Calculates the remainder

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
    }
}
