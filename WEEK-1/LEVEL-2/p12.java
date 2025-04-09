
import java.util.*;

public class p12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PRICE PER UNIT : ");
        double p = sc.nextDouble();
        System.out.println("ENTER THE TOTAL NUMBER OF UNITS : ");
        int quantity = sc.nextInt();
        double totalP = p * quantity;
        System.out.println("THE TOTAL PURCHASE PRICE IS INR " + totalP + " IF THE QUANTITY " + quantity + " AND UNIT PRICE IS INR " + p);
        sc.close();
    }
}
