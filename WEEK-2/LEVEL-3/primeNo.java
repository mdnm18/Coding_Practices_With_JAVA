
import java.util.*;

public class primeNo {

    public static void prime(int n) {
        if (n <= 1) {
            System.out.println(n + " IS NEITHER A PRIME NOR A COMPOSITE NUMBER.\nBECAUSE " + n + " IS NOT DIVISIBLE BY TWO NUMBERS.\n");
        } else {
            if (n == 2 || n == 3) {
                System.out.print("THE ENTERED NUMBER IS PRIME.");
            } else {
                String isprime = " ";
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    isprime = ((n % i) == 0) ? "ENTERED NUMBER IS NON-PRIME." : "ENTERED NUMBER IS PRIME.";
                }
                System.out.print(isprime);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(": LETS CHECK A NUMBER IS EITHER PRIME OR NOT :");
        System.out.print("ENTER THE NUMBER : ");
        int n = sc.nextInt();
        System.out.print("THE RESULT IS : \n");
        prime(n);
    }
}
