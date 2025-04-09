
import java.util.*;

public class positiveNegativeZero {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();
            String result = (n < 0) ? "THE ENTERED NUMBER IS A NEGATIVE NUMBER" : (n == 0) ? "THE ENTERED NUMBER IS ZERO" : " ENTERED NUMBER IS A POSITIVE NUMBER";
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
