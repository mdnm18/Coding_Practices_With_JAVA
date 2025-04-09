
import java.util.*;

public class divisibleByFive {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();
            if (n % 5 == 0) {
                System.out.println(n + " IS DIVISIBLE BY 5");
            } else {
                System.out.println(n + " IS NOT DIVISIBLE BY 5");
            }
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
