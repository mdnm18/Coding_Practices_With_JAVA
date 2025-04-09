
import java.util.*;

public class GradeCalculation {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE TOTAL NUMBER OF STUDENTS : ");
            int n = sc.nextInt();
            double physics[] = new double[n];
            double chemistry[] = new double[n];
            double maths[] = new double[n];
            double percentage[] = new double[n];
            String grade[] = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nENTER THE DETAIS FOR STUDENT-" + (i + 1) + " : ");

                System.out.println("ENTER THE MARKS FOR PHYSICS : ");
                physics[i] = sc.nextDouble();

                System.out.println("ENTER THE MARKS FOR CHEMISTRY : ");
                chemistry[i] = sc.nextDouble();

                System.out.println("ENTER THE MARKS FOR MATHS: ");
                maths[i] = sc.nextDouble();

                percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

                grade[i] = (percentage[i] >= 80) ? "A" : (percentage[i] >= 70) ? "B" : (percentage[i] >= 60) ? "C" : (percentage[i] >= 50) ? "D" : (percentage[i] >= 40) ? "E" : "R";
            }

            System.out.println("\nResults : ");
            System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Physics", "Chemistry", "Maths", "Percentage(%)", "Grade");
            for (int i = 0; i < n; i++) {
                System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f %-15s\n", physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
            }

        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
