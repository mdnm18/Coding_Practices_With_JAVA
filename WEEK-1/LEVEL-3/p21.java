
import java.util.*;

public class p21 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SALARY : ");
        float s = sc.nextFloat();
        System.out.println("BONUS : ");
        float b = sc.nextFloat();
        System.out.println("THE SALARY IS INR " + s + "AND BONUS IS INR " + b + " . HENCE TOTAL INCOME IS INR " + (s + b));
        sc.close();
    }
}
