
import java.util.*;

public class sumUntilZeroAndNegative {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            double total = 0.0;
            while (true) {
                System.out.println("ENTER A NUMBER (ENTER 0 or NEGATIVE DIGIT TO STOP) : ");
                int n = sc.nextInt();
                if (n <= 0) {
                    break;
                }
                total += n;
            }
            System.out.println("THE TOTAL SUM IS : " + total);
        }
    }
}
