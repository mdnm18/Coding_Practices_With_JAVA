
import java.util.*;

public class greatestFactor {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int number = sc.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("THE GREATEST FACTOR IS " + greatestFactor);
        sc.close();
    }
}
