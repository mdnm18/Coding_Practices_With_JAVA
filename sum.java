import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("ENTER THE FIRST NUMBER :");
            float a=sc.nextFloat();
            System.out.println("ENTER THE SECOND NUMBER :");
            float b=sc.nextFloat();
            sc.close();
            float add = a+b;
            System.out.println("THE SUMMATION OF TWO NUMBER IS : "+add);
        }
        catch (InputMismatchException e) 
        {
            System.out.println("Please enter valid floating-point numbers.");
        }

    }
}


