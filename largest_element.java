import java.util.*;
public class largest_element {

    public static int get_largest(int n[]) {
        int largest = Integer.MIN_VALUE; // (-infinity)
        for (int i = 0; i < n.length; i++) {
            if (largest < n[i]) 
            {
                largest = n[i];
            }
        }
        return largest;
    }

    public static int get_smallest(int n[]) {
        int smallest = Integer.MAX_VALUE; // (+infinity)
        for (int i = 0; i < n.length; i++) {
            if (smallest > n[i]) {
                smallest = n[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE TOTAL ELEMENT NUMBER OF ARRAY : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("ENTER THE ELEMENT OF ARRAY : ");
        for (int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("THE LARGEST ELEMENT IS : " + get_largest(a) + "\n");
        System.out.print("THE SMALLEST ELEMENT IS : " + get_smallest(a));
    }
}