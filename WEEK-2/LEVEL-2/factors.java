
import java.util.*;

public class factors {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
