
import java.util.*;

public class abundantNumber {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            String result = (sum > n) ? "ENTERED NUMBER IS AN ABUNDANT NUMBER" : "ENTERED NUMBER IS NOT AN ABUNDANT NUMBER";
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
