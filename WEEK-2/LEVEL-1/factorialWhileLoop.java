
import java.util.*;

public class factorialWhileLoop {

    public static int facto(int n) {
        int f = 1;
        int i = 1;
        while (i <= n) {
            f *= i;
            i++;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER : ");
        int n = sc.nextInt();
        System.out.println("THE FACTORIAL OF " + n + " IS : ");
        System.out.println(facto(n));
    }
}
