
import java.util.*;

public class linear_search {

    public static int linearSearch(int menu[], String desired_item) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == desired_item) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String menu[] = {"TEA", "COFFEE", "ORANGE", "CHICKEN", "MATTON"};
        System.out.print("ENTER YOUR DESIRED ITEM (TEA, COFFEE, ORANGE, CHICKEN, MATTON) : ");
        String desired_item = sc.next();
        sc.next();
        int index = linearSearch(menu, desired_item);
        if (index == 1) {
            System.out.print("FOUND!");
        } else {
            System.out.print("NOT FOUND!");
        }
    }
}
