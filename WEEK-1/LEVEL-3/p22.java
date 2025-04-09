
import java.util.*;

public class p22 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE 1ST NUMBER : ");
        int a = sc.nextInt();
        System.out.println("ENTER THE 2ND NUMBER : ");
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("THE SWAPPED NUMBER ARE " + a + " AND " + b);
        sc.close();
    }
}
