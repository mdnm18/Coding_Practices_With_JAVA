
import java.util.*;

public class p24 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT : ");
        float p = sc.nextFloat();
        System.out.println("ENTER THE RATE OF INTEREST : ");
        float r = sc.nextFloat();
        System.out.println("ENTER THE TIME : ");
        float t = sc.nextFloat();
        System.out.println("THE SIMPLE INTEREST IS " + (p * r * t / 100) + " FOR PRINCIPLE " + p + ", RATE OF INTEREST " + r + " AND TIME " + t);
        sc.close();
    }
}
