
import java.util.*;

public class bonus {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("YOUR SALARY : ");
            int s = sc.nextInt();
            System.out.println("YOUR YEAR OF SERVICE : ");
            int year = sc.nextInt();
            if (year > 5) {
                System.out.println("YOU WIIL GET 5% BONUS ON YOUR SALARY");
            } else {
                System.out.println("YOU WILL NOT GET ANY BONUS");
            }
        } catch (InputMismatchException e) {
            System.out.println("error!");
        }
    }
}
