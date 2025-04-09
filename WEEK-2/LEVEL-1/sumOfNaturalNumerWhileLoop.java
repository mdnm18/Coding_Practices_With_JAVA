
import java.util.*;

public class sumOfNaturalNumerWhileLoop {

    public static void main(String ars[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A NATURAL NUMBER : ");
            int n = sc.nextInt();
            int formulaSum, sum = 0, i = 1;
            if (n >= 0) {
                formulaSum = n * (n + 1) / 2;
                while (i <= n) {
                    sum += i;
                    i++;
                }
                System.out.println("SUM USING WHILE LOOP : " + sum);
                System.out.println("SUM USING FORMULA :" + formulaSum);
                String result = (sum == formulaSum) ? "BOTH RESULTS ARE CORRECT" : "THERE SEEMS TO BE A DISCREPENCY BETWEEN THE TWO RESULTS";
                System.out.println(result);
            } else {
                System.out.println("PLEASE ENTER A NATURAL NUMBER");
            }
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
