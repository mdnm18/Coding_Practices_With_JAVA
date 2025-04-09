
import java.util.*;

public class AvgmarksGradeRemarks {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER YOUR MARKS IN PHYSICS : ");
            int p = sc.nextInt();
            System.out.println("ENTER YOUR MARKS IN CHEMISTRY : ");
            int c = sc.nextInt();
            System.out.println("ENTER YOUR MARKS IN MATHS : ");
            int m = sc.nextInt();
            int total = p + c + m;
            double percentage = ((double) total / 300) * 100;
            char grade;
            String remarks;
            if (percentage >= 80) {
                grade = 'A';
                remarks = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70 && percentage <= 79) {
                grade = 'B';
                remarks = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60 && percentage <= 69) {
                grade = 'C';
                remarks = "Level 2, below but approaching agency-normalized standards";
            } else if (percentage >= 50 && percentage <= 59) {
                grade = 'D';
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40 && percentage <= 49) {
                grade = 'E';
                remarks = "Level 1, too below agency-normalized standards";
            } else {
                grade = 'R';
                remarks = "REMEDIAL STANDARDS";
            }
            int avg = total / 3;
            System.out.println("YOUR AVERAGE MARK IS : " + avg + "\n,GRADE IS : " + grade + "\nand REMARKS IS : " + remarks);

        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
