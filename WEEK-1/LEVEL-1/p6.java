
import java.util.*;

public class p6 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE TOTAL FEES : ");
            float TotalFee = sc.nextFloat();
            System.out.println("ENTER THE DISCOUNT : ");
            float DiscountP = sc.nextFloat();
            float DiscountedFee = TotalFee * DiscountP;
            float finalFee = TotalFee - DiscountedFee;
            System.out.println("THE DISCOUNT AMOUNT IS INR " + DiscountedFee + "\nAND FINAL DISCOUNTED FEE IS INR " + finalFee);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
