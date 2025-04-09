
import java.util.*;

public class p3 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE DISTANCE IN K.M. : ");
            double km = sc.nextFloat();
            double miles = km * 0.621371f;
            System.out.println("THE DISTANCE " + km + " K.M. IN MILES  IS : " + miles);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID DIGITS! PLEASE ENTER VALID DIGITS.");
        }
    }
}
