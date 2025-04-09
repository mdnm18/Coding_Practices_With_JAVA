
import java.util.*;

public class rocketLunchCountdown {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER COUNTDOWN START VALUE : ");
            int countDown = sc.nextInt();
            System.out.println("-------------------------------------------");
            while (countDown > 0) {
                System.out.println(countDown);
                countDown--;
            }
            System.out.println("-------------------------------------------");
            System.out.println("LIFTOFF!");
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
