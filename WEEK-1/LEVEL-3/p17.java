
import java.util.*;

public class p17 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NUMBER 1 : ");
        int a = sc.nextInt();
        System.out.println("NUMBER 2 : ");
        int b = sc.nextInt();
        System.out.println("THE QUOTIENT IS " + (a / b) + "AND REMINDER IS " + (a % b) + "OF TWO NUMBERS " + a + " AND " + b);
        sc.close();
    }
}
