
import java.util.*;

public class p19 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER :");
        double a = sc.nextDouble();
        System.out.println("ENTER 2nd NUMBER :");
        double b = sc.nextDouble();
        System.out.println("ENTER 3rd NUMBER :");
        double c = sc.nextDouble();

        System.out.println("1ST OPERATION : " + (a + b * c));
        System.out.println("2ND OPERATION : " + (a * b + c));
        System.out.println("3RD OPERATION : " + (c + a / b));
        System.out.println("4TH OPERATION : " + (a % b + c));
    }

}
