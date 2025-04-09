
import java.util.*;

public class bmi {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER YOUR WEIGHT IN KG : ");
            double w = sc.nextDouble();
            System.out.println("ENTER YOUR HEIGHT IN CM : ");
            double h = sc.nextDouble();
            double hInM = h / 100.0;
            double BMI = w / (hInM * hInM);
            System.out.println("YOUR BMI STATUS IS : ");
            String status = (BMI <= 18.4) ? "UNDERWEIGHT" : (BMI >= 18.5 && BMI <= 24.9) ? "NORMAL" : (BMI >= 25.0 && BMI <= 39.9) ? "OVERWEIGHT" : (BMI >= 40.0) ? "OBESE" : "INVALID INPUT";
            System.out.println(status);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
