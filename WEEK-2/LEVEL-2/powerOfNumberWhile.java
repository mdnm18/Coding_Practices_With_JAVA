
import java.util.*;

public class powerOfNumberWhile {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE BASE NUMBER : ");
            int b = sc.nextInt();
            System.out.println("ENTER THE POWER : ");
            int p = sc.nextInt();
            int result = 1;
            int counter = 1;
            while (counter <= p) {
                result *= b;
                counter++;
            }
            System.out.println(b + " TO THE POWER OF " + p + " IS : " + result);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
