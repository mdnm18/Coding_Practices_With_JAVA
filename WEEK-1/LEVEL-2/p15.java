
import java.util.*;

public class p15 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF SIDE-1 (IN METERS) : ");
        double a = sc.nextDouble();
        System.out.println("ENTER THE LENGTH OF SIDE-2 (IN METERS) : ");
        double b = sc.nextDouble();
        System.out.println("ENTER THE LENGTH OF SIDE-3 (IN METERS) : ");
        double c = sc.nextDouble();
        double perimeter = a + b + c;
        System.out.println("ENTER THE TOTAL DISTANCE WHICH THE ATHLETE HAVE TO COMPLETE (IN METER): ");
        double totalDistance = sc.nextDouble(); //5km=5000meter
        int rounds = (int) Math.ceil(totalDistance / perimeter);
        System.out.println("THE TOTAL NUMBER OF ROUNDS THE ATHLETE WILL RUN IS " + rounds + " TO COMPLETE " + totalDistance + " METER.");
        sc.close();

    }
}
