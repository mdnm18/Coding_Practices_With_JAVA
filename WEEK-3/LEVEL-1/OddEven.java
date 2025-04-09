
import java.util.*;

public class OddEven {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE UPPER LIMIT OF THE EVEN-ODD SERIES : ");
            int n = sc.nextInt();
            if (n < 1) {
                System.out.println("ERROR: ENTER A NATURAL NUMBER GREATER THAN 0.");
                // sc.close();
                // return;
                System.exit(0);
            }

            int evenSize = n / 2 + 1;
            int oddSize = n / 2 + 1;

            int evenNumbers[] = new int[evenSize];
            int oddNumbers[] = new int[oddSize];

            int evenIndex = 0, oddIndex = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    evenNumbers[evenIndex++] = i;
                } else {
                    oddNumbers[oddIndex++] = i;
                }
            }
            System.out.println("THE EVEN NUMBERS ARE : ");
            for (int i = 0; i < evenNumbers.length; i++) {
                System.out.print(evenNumbers[i] + " ");
            }

            System.out.println("\nTHE ODD NUMBERS ARE : ");
            for (int i = 0; i < oddNumbers.length; i++) {
                System.out.print(oddNumbers[i] + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
