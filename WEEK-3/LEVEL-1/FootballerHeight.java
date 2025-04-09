
import java.util.*;

public class FootballerHeight {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int heights[] = new int[11];
            int totalHeight = 0;
            for (int i = 0; i < heights.length; i++) {
                System.out.println("ENTER THE HEIGHT OF FOOTBALLER - " + (i + 1) + " IS : ");
                heights[i] = sc.nextInt();
            }

            for (int j = 0; j < heights.length; j++) {
                totalHeight += heights[j];
            }
            System.out.println("THE SUM OF ALL FOOTBALLER'S HEIGHT IS : " + totalHeight);

            double mean = totalHeight / 11.0;
            System.out.println("THE MEAN HEIGHT OF PLAYERS PRESENT IN THAT FOOTBALL TEAM IS : " + mean);
        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
