
import java.util.*;

public class smallestNumber {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE FIRST NUMBER : ");
            int a = sc.nextInt();
            System.out.println("ENTER THE SECOND NUMBER : ");
            int b = sc.nextInt();
            System.out.println("ENTER THE 3RD NUMBER : ");
            int c = sc.nextInt();
            String r = (a < b && a < c) ? "YES THE FIRST NUMBER " + a + " IS THE SMALLEST" : "NO THE FIRST NUMBER " + a + " IS NOT THE SMALLEST";
            System.out.println(r);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
