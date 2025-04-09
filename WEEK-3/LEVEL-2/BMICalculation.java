
import java.util.*;

public class BMICalculation {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE TOTAL NUMBER OF PERSONS : ");
            int n = sc.nextInt();
            double weight[] = new double[n];
            double height[] = new double[n];
            double bmiStatus[] = new double[n];
            String weightStatus[] = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nENTER THE DETAIS FOR PERSON-" + (i + 1) + " : ");

                System.out.println("ENTER THE WEIGHT(in KG) : ");
                weight[i] = sc.nextDouble();

                System.out.println("ENTER THE HEIGHT (in meters) : ");
                height[i] = sc.nextDouble();

                bmiStatus[i] = weight[i] / (height[i] * height[i]);

                weightStatus[i] = (bmiStatus[i] <= 18.4) ? "UnderWeight" : (bmiStatus[i] >= 18.5 && bmiStatus[i] <= 24.9) ? "Normal" : (bmiStatus[i] >= 25.0 && bmiStatus[i] <= 39.9) ? "Overweight" : "Obese";
            }

            System.out.println("\nResults : ");
            System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
            for (int i = 0; i < n; i++) {
                System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", height[i], weight[i], bmiStatus[i], weightStatus[i]);
            }

        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
