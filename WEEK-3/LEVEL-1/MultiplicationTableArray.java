
import java.util.*;

public class MultiplicationTableArray {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE NUMBER : ");
            int n = sc.nextInt();
            int result[] = new int[10];
            for (int i = 0; i < result.length; i++) {
                result[i] = (i + 1) * n;
            }

            System.out.println("THE MULTIPLICATION TABLE OF " + n + " IS : ");
            for (int j = 0; j < result.length; j++) {
                System.out.println(result[j]);
            }
        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
