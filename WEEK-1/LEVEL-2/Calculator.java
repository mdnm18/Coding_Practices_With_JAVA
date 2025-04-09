
import java.util.*;

public class Calculator {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("CALCULATOR :->");
            System.out.println("ENTER THE 1ST NUMBER : ");
            float a = sc.nextInt();
            System.out.println("ENTER THE 2ND NUMBER : ");
            float b = sc.nextInt();
            float add = a + b;
            float sub = a - b;
            float multi = a * b;
            float divi = a / b;
            System.out.println("THE ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION VALUE OF 2 NUMBERS " + a + " AND " + b + " IS \n" + add + " , \n" + sub + " , \n" + multi + " AND \n" + divi);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
