
import java.util.*;

public class largestNumber {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE FIRST NUMBER : ");
            int a = sc.nextInt();
            System.out.println("ENTER THE SECOND NUMBER : ");
            int b = sc.nextInt();
            System.out.println("ENTER THE 3RD NUMBER : ");
            int c = sc.nextInt();
            String r = (a > b && a > c) ? "YES THE FIRST NUMBER " + a + " IS THE LARGEST" : (b > a && b > c) ? "YES THE 2ND NUMBER " + b + " IS THE LARGEST NUMBER" : "YES THE 3RD NUMBER " + c + " IS THE LARGEST NUMBER";

            System.out.println(r);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
