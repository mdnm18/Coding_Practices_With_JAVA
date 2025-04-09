
import java.util.*;

public class CountDigits {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0, r;
            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();
            while (n != 0) {
                r = n % 10;
                count++;
                n = n / 10;
            }
            System.out.println("THE TOTAL DIGITS IN " + n + " IS : " + count);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
