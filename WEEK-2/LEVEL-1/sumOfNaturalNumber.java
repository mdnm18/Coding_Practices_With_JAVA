
import java.util.*;

public class sumOfNaturalNumber {

    public static void main(String ars[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A NATURAL NUMBER : ");
            int n = sc.nextInt();
            int result;
            if (n >= 0) {
                result = n * (n + 1) / 2;
                System.out.println("THE SUM OF " + n + " NATURAL NUMBERS IS " + result);
            } else {
                System.out.println("THE NUMBER IS NOT A NATURAL NUMBER.");
            }
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
