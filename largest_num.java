import java.util.*;

public class largest_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int a = sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int b = sc.nextInt();
        System.out.println("ENTER THE THIRD NUMBER : ");
        int c = sc.nextInt();
        sc.close();
        if (a > b && a > c) {
            System.out.println(a + "IS THE LARGEST NUMMBER.");
        } else if (b > a && b > c) {
            System.out.println(b + "IS THE LARGEST NUMMBER.");
        } else {
            System.out.println(c + "IS THE LARGEST NUMMBER.");
        }
    }
}