
import java.util.*;

public class Bonus {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            final int employeeCount = 3;
            double salaries[] = new double[employeeCount];
            double years[] = new double[employeeCount];
            double newSalary[] = new double[employeeCount];
            double bonuses[] = new double[employeeCount];
            double totalBonus = 0;
            double totalOldSalary = 0;
            double totalNewSalary = 0;

            //input
            for (int i = 0; i < employeeCount; i++) {
                System.out.println("ENTER SALARY FOR THE EMPLOYEE - " + (i + 1) + " : ");
                double salary = sc.nextDouble();
                System.out.println("ENTER THE YEAR OF SERVICE OF THE EMPLOYEE - " + (i + 1) + " : ");
                double year = sc.nextDouble();

                if (salary <= 0 || year <= 0) {
                    i--;
                    continue;
                }
                salaries[i] = salary;
                years[i] = year;
            }

            //calculate
            for (int i = 0; i < employeeCount; i++) {
                double bonusPercentage = (years[i] > 5) ? 0.05 : 0.02;
                bonuses[i] = salaries[i] * bonusPercentage;
                newSalary[i] = salaries[i] + bonuses[i];

                totalBonus += bonuses[i];
                totalOldSalary += salaries[i];
                totalNewSalary += newSalary[i];
            }

            //output
            System.out.println("\nTOTAL OLD SALARIES : " + totalOldSalary);
            System.out.println("TOTAL BONUS PAYOUT : " + totalBonus);
            System.out.println("TOTAL NEW SALARIES : " + totalNewSalary);

        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT! ENTER AGAIN.");
        }
    }
}
