
import java.util.*;

public class p1 {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("LET'S DETERMINE YOUR AGE");
            System.out.println("ENTER THE CURRENT YEAR : ");
            int year = sc.nextInt();
            System.out.println("ENTER YOUR BIRTH YEAR : ");
            int BirthYear = sc.nextInt();
            int age = year - BirthYear;
            System.out.println("YOUR CURRENT AGE IS : " + age);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID DIGITS! PLEASE ENTER INTEGER DIGITS.");
        }
    }
}
