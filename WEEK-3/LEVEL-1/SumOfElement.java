
import java.util.*;

public class SumOfElement {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            double num[] = new double[10];
            double totalSum = 0;
            int i = 0;

            while (true) {
                System.out.println("ENTER THE NUMBER (0 OR NEGATIVE NUMBER FOR EXIT) : ");
                double n = sc.nextDouble();
                if (n <= 0) {
                    break;
                }

                num[i] = n;
                i++;

                if (i == 10) {
                    break;
                }
            }

            System.out.println("THE ELEMETS ARE : ");
            for (int j = 0; j < num.length; j++) {
                System.out.println(num[j] + " ");
                totalSum += num[j];
            }

            System.out.println("THE TOTAL SUM OF ALL ELEMENT IN OUR ARRAY IS : " + totalSum);
        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
