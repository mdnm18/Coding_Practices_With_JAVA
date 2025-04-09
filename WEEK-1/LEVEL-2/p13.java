
import java.util.*;

public class p13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE IN CELSIUS : ");
        float c = sc.nextFloat();
        float f = (c * 9f / 5f) + 32f;
        System.out.println("THE " + c + " CELSIUS IS " + f + " FAHRENHEIT");
        sc.close();
    }
}
