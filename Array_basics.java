// OPERATIONS OF ARRAY IN JAVA.
// import java.util.*;
// public class Array_basics 
// {
// public static void main(String args[]) 
// {
// int arr[] = new int[100]; //CREATE AN ARRAY.
// Scanner sc = new Scanner(System.in);
// System.out.print("ENTER YOUR MARK-1 : \n");
// arr[0] = sc.nextInt(); // INPUT
// System.out.print("ENTER YOUR MARK-2 : \n");
// arr[1] = sc.nextInt(); // INPUT
// sc.close();
// System.out.print("MARK-1 : " + arr[0] + "\n"); // OUTPUT
// System.out.print("MARK-2 : " + arr[1] + "\n"); // OUTPUT
// arr[0] = 100; // UPDATE
// arr[1] += 10; // UPDATE
// System.out.print("UPDATED MARK-1 : " + arr[0] + "\n");
// System.out.print("UPDATED MARK-2 : " + arr[1] + "\n");
// }
// }
// 

// PASSING ARRAY AS ARGUMENT :
public class Array_basics {

    public static void update(int mark[], int noChange) {
        noChange = 10;
        for (int i = 0; i < mark.length; i++) {
            mark[i] += 2;
        }
    }

    public static void main(String args[]) {
        int mark[] = {50, 60, 70, 80};
        int noChange = 5;
        update(mark, noChange);
        System.out.print(noChange + "\n");
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] + " ");
        }
        System.out.println();
    }
}
