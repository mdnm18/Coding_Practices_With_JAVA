
import java.util.*;

public class harshadNumber {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();
            int temp = n, sum = 0, r;
            while (n != 0) {
                r = n % 10;
                sum += r;
                n = n / 10;
            }
            String result = ((temp % sum) == 0) ? "ENTERED NUMBER IS A HARSHAD NUMBER" : "ENTERED NUMBER IS NOT A HARSHAD NUMBER";
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        }
    }
}
