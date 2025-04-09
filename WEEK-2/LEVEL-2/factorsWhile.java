
import java.util.*;

public class factorsWhile {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int number = sc.nextInt();
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}
