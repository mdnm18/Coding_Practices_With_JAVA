
import java.util.*;

public class springSeason {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE MONTH (1-12) : ");
            int m = sc.nextInt();
            System.out.println("ENTER THE DAY (1-31) : ");
            int d = sc.nextInt();
            boolean isSpring = (m == 3 && d >= 20) || (m == 6 && d <= 20) || (m > 3 && m < 6);
            String result = (isSpring) ? "IT IS A SPRING SEASON" : "IT IS NOT A SPRING SEASON";
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
