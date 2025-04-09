
import java.util.*;

public class p23 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE NUMBER TOTAL CHOCOLATES : ");
            int chocolates = sc.nextInt();
            System.out.println("ENTER THE NUMBER OF TOTAL CHILDREN : ");
            int child = sc.nextInt();
            int chocoGet = chocolates / child;
            int chocoLeft = chocolates % child;
            System.out.println("THE NUMBER OF CHOCOLATES EACH CHILD GETS IS " + chocoGet + " AND THE NUMBER OF REMAINING CHOCOLATES ARE " + chocoLeft);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
