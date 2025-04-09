
import java.util.*;

public class multiplesWhile {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER BELOW 100 : ");
        int number = sc.nextInt();
        System.out.println("MULTIPLES OF " + number + " BELOW 100 :");
        if (number >= 0 && number <= 100) {
            int counter = number - 1;
            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("INVALID INPUT! ENTER A NUMBER WHICH IS IN THE RANGE OF 0-100.");
        }
        sc.close();
    }
}
