
import java.util.*;

public class p25 {

    // Function to convert weight from pounds to kilograms
    public static double poundsToKg(double weightInPounds) {
        double weightInKg = weightInPounds * 0.453592;
        return weightInKg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = sc.nextDouble();

        // Conversion
        double weightInKg = poundsToKg(weightInPounds);

        // Output the result
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f%n", weightInPounds, weightInKg);
        sc.close();
    }
}
