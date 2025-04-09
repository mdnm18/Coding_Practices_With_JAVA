// PRINT SUB-ARRAYS / PRINT TOTAL NUMBER OF SUB-ARRAY / SUM OF EACH SUB-ARRAYS / PRINT MAX-SUM & MIN-SUM.

import java.util.*;

public class Sub_Array {

    public static void printsubarrays(int a[]) {
        int ts = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print("[" + a[k] + "]");
                    sum += a[k];
                }
                ts++;
                System.out.println(" => SUM OF ALL ELEMENTS IN THIS SUB-ARRAY : " + sum);
                if (max_sum < sum) {
                    max_sum = sum;
                }
                if (min_sum > sum) {
                    min_sum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("THE TOTAL NUMBER OF SUB-ARRAYS : " + ts);
        System.out.println("THE MAXIMUM SUM AMONG EACH SUM OF SUB_ARRAYS : " + max_sum);
        System.out.println("THE MINIMUM SUM AMONG EACH SUM OF SUB_ARRAYS : " + min_sum);
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
