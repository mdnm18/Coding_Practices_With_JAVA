
import java.util.*;

public class p20 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE IN FAHRENHEIT : ");
        float f = sc.nextFloat();
        float c = (f - 32) * 5 / 9;
        System.out.println("THE " + f + " FAHRENHEIT IS " + c + " CELSIUS");
        sc.close();
    }
}