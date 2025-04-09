
import java.util.*;

public class greatestFactorWhile {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int number = sc.nextInt();
        int greatestFactor = 1;
        int i = number - 1;
        while (i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println("THE GREATEST FACTOR IS " + greatestFactor);
        sc.close();
    }
}
