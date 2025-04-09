
import java.util.*;

public class factorialRecursion {

    public static int facto(int n) {
        int f;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            f = n * facto(n - 1);
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER : ");
        int n = sc.nextInt();
        System.out.println("THE FACTORIAL OF " + n + " IS : " + facto(n));
    }
}
