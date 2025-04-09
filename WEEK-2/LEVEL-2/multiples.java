
import java.util.*;

public class multiples {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER BELOW 100 : ");
        int number = sc.nextInt();
        System.out.println("MULTIPLES OF " + number + " BELOW 100 :");
        if (number >= 0 && number <= 100) {
            for (int i = number - 1; i > 1; i--) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("INVALID INPUT! ENTER A NUMBER WHICH IS IN THE RANGE OF 0-100.");
        }
        sc.close();
    }
}
