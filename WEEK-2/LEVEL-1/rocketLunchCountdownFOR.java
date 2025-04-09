
import java.util.*;

public class rocketLunchCountdownFOR {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER COUNTDOWN START VALUE : ");
            int countDown = sc.nextInt();
            System.out.println("-------------------------------------------");
            for (int i = countDown; i > 0; i--) {
                System.out.println(i);
            }
            System.out.println("-------------------------------------------");
            System.out.println("LIFTOFF!");
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
