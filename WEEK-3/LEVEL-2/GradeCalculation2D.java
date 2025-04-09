
import java.util.*;

public class GradeCalculation2D {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE TOTAL NUMBER OF STUDENTS : ");
            int n = sc.nextInt();
            double marks[][] = new double[n][3];
            double percentage[] = new double[n];
            String grade[] = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\nENTER THE DETAIS FOR STUDENT-" + (i + 1) + " : ");

                do {
                    System.out.println("ENTER THE MARKS FOR PHYSICS : ");
                    marks[i][0] = sc.nextDouble();
                    if (marks[i][0] <= 0) {
                        System.out.println("MARKS MUST BE POSITIVE. PLEASE ENTER AGAIN!");
                    }
                } while (marks[i][0] <= 0);

                do {
                    System.out.println("ENTER THE MARKS FOR CHEMISTRY : ");
                    marks[i][1] = sc.nextDouble();
                    if (marks[i][1] <= 0) {
                        System.out.println("MARKS MUST BE POSITIVE. PLEASE ENTER AGAIN!");
                    }
                } while (marks[i][1] <= 0);

                do {
                    System.out.println("ENTER THE MARKS FOR MATHS : ");
                    marks[i][2] = sc.nextDouble();
                    if (marks[i][2] <= 0) {
                        System.out.println("MARKS MUST BE POSITIVE. PLEASE ENTER AGAIN!");
                    }
                } while (marks[i][2] <= 0);

                percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
                grade[i] = (percentage[i] >= 80) ? "A" : (percentage[i] >= 70) ? "B" : (percentage[i] >= 60) ? "C" : (percentage[i] >= 50) ? "D" : (percentage[i] >= 40) ? "E" : "R";
            }
            System.out.println("\nResults : ");
            System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Physics", "Chemistry", "Maths", "Percentage(%)", "Grade");
            for (int i = 0; i < n; i++) {
                System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f %-15s\n", marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
            }
        } catch (InputMismatchException e) {
            System.err.println("INVAID INPUT!");
        }
    }
}
