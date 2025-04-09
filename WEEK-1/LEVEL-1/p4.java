
import java.util.*;

public class p4 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE COST PRICE : ");
            float costP = sc.nextFloat();
            System.out.println("ENTER THE SELLING PRICE : ");
            float sellingP = sc.nextFloat();
            float profit = sellingP - costP;
            float ProfitP = profit / costP * 100;
            System.out.println("THE COST PRICE IS INR " + costP + " AND THE SELLING PRICE IS INR " + sellingP + "\nTHE PROFIT IS INR " + profit + " AND THE PROFIT PERCENTAGE IS " + ProfitP);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT !");
        }
    }
}
