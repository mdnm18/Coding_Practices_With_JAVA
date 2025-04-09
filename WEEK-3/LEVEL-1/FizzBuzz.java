
import java.util.*;

public class FizzBuzz {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A POSITIVE INTEGER NUMBER : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.err.println("ERROR! : PLEASE ENTER A POSITIVE NUMBER.");
            System.exit(0);
        }
        String results[] = new String[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        System.out.println("\nFizzBuzz Results : ");
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
