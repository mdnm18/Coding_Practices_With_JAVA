
import java.util.*;

public class leapYear {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A YEAR TO CHECK IT'S TYPE- LEAP YEAR OR NON-LEAP YEAR :");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("ENTERED YEAR IS LEAP YEAR");
            } else if (year % 400 == 0) {
                System.out.println("ENTERED YEAR IS LEAP YEAR");
            } else {
                System.out.println("ENTERED YEAR IS NON-LEAP YEAR");
            }
        } else {
            System.out.println("ENTERED YEAR IS NON-LEAP YEAR");
        }

        sc.close();
    }
}
