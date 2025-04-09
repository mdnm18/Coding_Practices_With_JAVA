
import java.util.*;

public class CanStudentsVote {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int ages[] = new int[10];
            for (int i = 0; i < ages.length; i++) {
                System.out.println("ENTER THE AGE FOR THE " + (i + 1) + " STUDENT : ");
                ages[i] = sc.nextInt();
            }
            String r = "";
            for (int i = 0; i < ages.length; i++) {
                if (ages[i] < 0) {
                    System.err.println("INVALID AGE!");
                } else {
                    r = (ages[i] > 18) ? "THE STUDENT WITH AGE " + ages[i] + " CAN GIVE VOTE" : "THE STUDENT WITH AGE " + ages[i] + " CANNOT GIVE VOTE";
                    System.out.println(r);
                }
            }

        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
