
import java.util.*;

public class MultiplicationTabale {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE NUMBER : ");
            int n = sc.nextInt();
            int result[] = new int[4];
            for (int i = 0; i < result.length; i++) {
                result[i] = (i + 6) * n;
            }
            System.out.println("THE MULTIPLICATION TABLE (6-9) OF " + n + " IS : ");
            for (int j = 0; j < result.length; j++) {
                System.out.println(result[j]);
            }
        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
