
import java.util.*;

public class Factorial {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();

            int maxFactor = 10;
            int factors[] = new int[maxFactor];
            int index = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    if (index == maxFactor) {
                        maxFactor *= 2;
                        int temp[] = new int[maxFactor];
                        System.arraycopy(factors, 0, temp, 0, factors.length);
                        factors = temp;
                    }
                    factors[index++] = i;
                }
            }
            System.out.println("\nFACTORS OF " + n + " IS : ");
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i] + " ");
            }

        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
