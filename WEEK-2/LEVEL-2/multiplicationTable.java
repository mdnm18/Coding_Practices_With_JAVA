
import java.util.*;

public class multiplicationTable {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE DIGIT : ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println("THE MULTIPLICATION TABLE OF " + n + " IS : " + i + " X " + n + " = " + i * n);
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR!");
        }
    }
}
