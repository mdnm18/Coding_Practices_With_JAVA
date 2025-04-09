
import java.util.*;

public class p18 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER :");
        int a = sc.nextInt();
        System.out.println("ENTER 2nd NUMBER :");
        int b = sc.nextInt();
        System.out.println("ENTER 3rd NUMBER :");
        int c = sc.nextInt();

        System.out.println("1ST OPERATION : " + (a + b * c));
        System.out.println("2ND OPERATION : " + (a * b + c));
        System.out.println("3RD OPERATION : " + (c + a / b));
        System.out.println("4TH OPERATION : " + (a % b + c));
    }

}
