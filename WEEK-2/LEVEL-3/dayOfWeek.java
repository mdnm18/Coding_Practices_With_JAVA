
import java.util.*;

public class dayOfWeek {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE MONTH (1-12) : ");
        int m = sc.nextInt();

        System.out.println("ENTER THE DAY (1-31) : ");
        int d = sc.nextInt();

        System.out.println("ENTER THE YEAR (e.g., 2006) : ");
        int y = sc.nextInt();

        // int m = Integer.parseInt(args[0]);
        // int d = Integer.parseInt(args[1]);
        // int y = Integer.parseInt(args[2]);
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("THE DAY OF THE WEEK IS : " + d0);
    }
}
