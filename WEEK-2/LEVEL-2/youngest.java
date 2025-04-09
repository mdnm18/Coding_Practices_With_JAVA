
import java.util.*;

public class youngest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String names[] = {"AMAR", "AKBAR", "ANTHONY"};
        int age[] = new int[3];
        int height[] = new int[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("ENTER THE AGE AND HEIGHT OF " + names[i] + " :");
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        String youngestName = "";
        for (int i = 0; i < age.length; i++) {
            if (smallest > age[i]) {
                smallest = age[i];
                youngestName = names[i];
            }
        }
        System.out.println("THE SMALLEST OF THE AGE IS " + smallest + " WHICH IS " + youngestName); // Moved outside the loop

        int largest = Integer.MIN_VALUE;
        String tallestName = "";
        for (int i = 0; i < height.length; i++) {
            if (largest < height[i]) {
                largest = height[i];
                tallestName = names[i];
            }
        }
        System.out.println("THE LARGEST OF THE HEIGHT IS " + largest + " WHICH IS " + tallestName); // Moved outside the loop

        sc.close();
    }
}
