import java.util.*;
public class average__three_no 
{
    public static double average(double x, double y, double z) 
    {
        return (x+y+z)/3;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER :");
        double a=sc.nextDouble();
        System.out.print("ENTER THE SECOND NUMBER :");
        double b=sc.nextDouble();
        System.out.print("ENTER THE THIRD NUMBER :");
        double c=sc.nextDouble();
        sc.close();
        System.out.println("THE AVERAGE OF GIVEN NUMBER IS :"+average(a,b,c));
    }  
}