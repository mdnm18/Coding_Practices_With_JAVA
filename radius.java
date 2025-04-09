import java.util.*;
public class radius 
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("ENTER THE RADIUS OF A CIRCLE :");
            float r=sc.nextFloat();
            /*float area=3.14f*r*r;
            Additionally, it’s a good practice to use Math.PI for the value of pi, as it is more precise than 3.14f. Here’s how you can improve the calculation of the area:
            float area = (float) (Math.PI * r * r);*/
            float area = (float) (Math.PI * r * r);
            System.out.println("THE AREA OF A CIRCLE IS :" +area);             
        }
        catch(InputMismatchException e)
        {
            System.out.println("PLEASE ENTER A VALID FLOATING-POINT NUMBER.");
        }
    }
}
