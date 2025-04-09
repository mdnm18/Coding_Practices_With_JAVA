
import java.util.*;

public class LargestSecondLargestDynamic {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int maxDigit = 10;
            int digit[] = new int[maxDigit];
            int index = 0;

            System.out.println("ENTER A NUMBER : ");
            int n = sc.nextInt();

            while (n > 0) {
                if (index == maxDigit) {
                    maxDigit += 10;
                    int temp[] = new int[maxDigit];
                    System.arraycopy(digit, 0, temp, 0, index);
                    digit = temp;
                }
                digit[index] = n % 10;
                n /= 10;
                index++;
            }
            int largest = -1, secLargest = -1;
            for (int i = 0; i < index; i++) {
                if (digit[i] > largest) {
                    secLargest = largest;
                    largest = digit[i];
                } else if (digit[i] > secLargest && digit[i] != largest) {
                    secLargest = digit[i];
                }
            }

            System.out.println("\nLargest Digit : " + largest);
            System.out.println("Second Largest Digit : " + (secLargest != -1 ? secLargest : "No second largest digit"));
        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
