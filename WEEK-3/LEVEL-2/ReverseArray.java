
import java.util.*;

public class ReverseArray {

    public static void reverseArray(int a[]) {
        int start = 0, end = a.length - 1;
        while (start < end) {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE SIZE OF THE ARRAY : ");
            int size = sc.nextInt();
            int a[] = new int[size];
            System.out.println("ENTER THE ELEMENTS OF THE ARRAY : ");
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("THE REVERSED FORM OF YOUR ARRAY IS : ");
            reverseArray(a);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid Input!");
        }
    }
}
