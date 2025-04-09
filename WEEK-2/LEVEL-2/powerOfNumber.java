
import java.util.*;

public class powerOfNumber {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE BASE NUMBER : ");
            int b = sc.nextInt();
            System.out.println("ENTER THE POWER : ");
            int p = sc.nextInt();
            int result = 1;
            for (int i = 1; i <= p; i++) {
                result *= b;
            }
            System.out.println(b + " TO THE POWER OF " + p + " IS : " + result);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
