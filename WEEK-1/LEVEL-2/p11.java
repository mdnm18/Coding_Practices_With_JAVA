
import java.util.*;

public class p11 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
        "LETS FIND THE SIDE OF THE SQUARE :");
        System.out.println("ENTER THE PARAMETER OF SQUARE : ");
        int parameter = sc.nextInt();
        int side = parameter / 4;
        System.out.println("THE LENGTH OF THE SIDE IS " + side + " WHOSE PARAMETER IS " + parameter);
        sc.close();
    
}
}
