
import java.util.*;

public class p5 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE NUMBER TOTAL PENS : ");
            int pen = sc.nextInt();
            System.out.println("ENTER THE NUMBER OF TOTAL STUDENTS : ");
            int student = sc.nextInt();
            int penGet = pen / student;
            int penLeft = pen % student;
            System.out.println("THE PEN PER STUDENT IS " + penGet + " AND THE REMAINING PEN NOT DISTRIBUTED IS " + penLeft);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
