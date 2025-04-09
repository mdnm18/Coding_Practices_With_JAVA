
import java.util.*;

public class DigitFrequency {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        String n = sc.next();
        sc.close();

        int frequency[] = new int[10];

        for (char digit : n.toCharArray()) {
            frequency[digit - '0']++;
        }

        System.out.println("Digit Frequencies : ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
    }
}
