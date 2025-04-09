
import java.util.*;
//creating a class
public class p14 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STUDENT : ");
        int n = sc.nextInt();
        int handShakes = (n * (n - 1)) / 2;
        System.out.println("THE NUMBER OF POSIBLE HANDSHAKES ARE : " + handShakes);
        sc.close();
    }
}
