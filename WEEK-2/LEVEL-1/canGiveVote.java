
import java.util.*;

public class canGiveVote {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER YOUR AGE : ");
            int age = sc.nextInt();
            String result = (age >= 18) ? "THE PERSON'S AGE IS " + age + " AND CAN GIVE VOTE" : "THE PERSON'S AGE IS " + age + " AND CANNOT GIVE VOTE";
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
