
import java.util.*;

public class LargestSecondLargest {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            final int maxDigit = 10;
            int digits[] = new int[maxDigit];
            int index = 0;

            // input
            System.out.println("ENTER A INTEGER NUMBER : ");
            int n = sc.nextInt();

            while (n > 0 && index < maxDigit) {
                digits[index] = n % 10;
                n /= 10;
                index++;
            }

            int largest = -1, secLargest = -1;
            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secLargest && digits[i] != largest) {
                    secLargest = digits[i];
                }
            }

            System.out.println("\nLARGEST DIGIT : " + largest);
            System.out.println("SECOND LARGEST DIGIT : " + ((secLargest != -1) ? secLargest : "NO SECOND LARGEST DIGIT IN THE NUMBER"));

        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
