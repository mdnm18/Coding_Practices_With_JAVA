
import java.util.*;

public class BMICalculation2D {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE TOTAL NUMBER OF PERSONS : ");
            int n = sc.nextInt();
            double personData[][] = new double[n][3];
            String weightStatus[] = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\nENTER THE DETAIS FOR PERSON-" + (i + 1) + " : ");

                do {
                    System.out.println("ENTER THE WEIGHT(in KG) : ");
                    personData[i][0] = sc.nextDouble();
                    if (personData[i][0] <= 0) {
                        System.out.println("WEIGHT MUST BE POSITIVE. PLEASE ENTER AGAIN!");
                    }
                } while (personData[i][0] <= 0);

                do {
                    System.out.println("ENTER THE HEIGHT (in meter) : ");
                    personData[i][1] = sc.nextDouble();
                    if (personData[i][1] <= 0) {
                        System.out.println("HEIGHT MUST BE POSITIVE. PLEASE ENTER AGAIN!");
                    }
                } while (personData[i][1] <= 0);

                personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
                weightStatus[i] = (personData[i][2] <= 18.4) ? "UnderWeight" : (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) ? "Normal" : (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) ? "Overweight" : "Obese";
            }
            System.out.println("\nResults : ");
            System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
            for (int i = 0; i < n; i++) {
                System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
            }
        } catch (InputMismatchException e) {
            System.err.println("INVAID INPUT!");
        }
    }
}
