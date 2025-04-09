
import java.util.*;

public class p2 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER YOUR MARKS IN MATHS : ");
            int math = sc.nextInt();
            System.out.println("ENTER YOUR MARKS IN PHYSICS : ");
            int phys = sc.nextInt();
            System.out.println("ENTER YOUR MARKS IN CHEMISTRY : ");
            int chem = sc.nextInt();
            int total = (math + phys + chem);
            int MaxMarks = 300;
            int percentage = (total * 100 / MaxMarks);
            System.out.println("TOTAL AGERAGE PERCENTAGE IS : " + percentage);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID DIGITS! PLEASE ENTER INTEGER DIGITS.");
        }
    }
}
