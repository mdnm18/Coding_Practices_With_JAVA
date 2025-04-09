
import java.util.*;

public class armstrongNumber {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int temp, r, sum = 0;
            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();
            temp = n;
            while (n != 0) {
                r = n % 10;
                sum += (r * r * r);
                n = n / 10;
            }
            String print = (temp == sum) ? "ENTERED NUMBER IS AN ARMSTRONG NUMBER" : "ENTERED NUMBER IS NOT AN ARMSTRONG NUMBER";
            System.out.println(print);
        } catch (InputMismatchException e) {
            System.out.println("Error!");
        }
    }
}
