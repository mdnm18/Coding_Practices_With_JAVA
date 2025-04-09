
import java.util.*;

public class p8 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER YOUR BODY HEIGHT IN C.M. : ");
            float heightCM = sc.nextFloat();
            float heightINCH = heightCM * 0.393701f;
            float heightFEET = heightINCH / 12;
            System.out.println("YOUR HEIGHT IN CM IS " + heightCM + " WHILE IN FEET IS " + heightFEET + " AND IN INCHES IS " + heightINCH);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
