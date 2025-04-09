
import java.util.*;

public class factorial {

    public static int facto(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();
            System.out.println("THE FACTORIAL OF " + n + " IS : " + facto(n));
        }
    }
}
