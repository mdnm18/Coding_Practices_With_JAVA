// MAX SUB-ARRAY USING PREFIX ARRAY : 

import java.util.*;

public class prefix_array {

    public static void max_subarrays_sum(int a[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[a.length];
        prefix[0] = a[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        for (int start = 0; start) {

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("ENTER THE ELEMENTS OF ARRAY : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("THE SUB-ARRAYS ARE : ");
        printsubarrays(a);
        sc.close();
    }
}
