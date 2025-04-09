
import java.util.*;

public class AreaTriangle {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("LETS CALCULATE THE AREA OF A TRIANGLE :");
            System.out.println("ENTER THE BASE IN C.M. : ");
            float base = sc.nextFloat();
            System.out.println("ENTER THE HEIGHT IN C.M. : ");
            float height = sc.nextFloat();
            float AreaCM = 1f / 2f * base * height;
            float AreaInch = AreaCM * 0.393701f;
            float AreaFeet = AreaInch / 12;
            System.out.println("YOUR HEIGHT IN CM IS " + AreaCM + " WHILE IN FEET IS " + AreaFeet + " AND INCHES IS " + AreaInch);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
