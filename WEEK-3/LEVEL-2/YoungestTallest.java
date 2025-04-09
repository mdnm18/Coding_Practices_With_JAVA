
import java.util.*;

public class YoungestTallest {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 3;
            String names[] = {"AMAR", "AKBAR", "ANTHONY"};
            double age[] = new double[count];
            double height[] = new double[count];

            //input
            for (int i = 0; i < count; i++) {
                System.out.println("ENTER THE AGE (IN YEARS) OF " + names[i] + " : ");
                age[i] = sc.nextDouble();
                System.out.println("ENTER THE HEIGHT (IN FOOT) OF " + names[i] + " : ");
                height[i] = sc.nextDouble();
            }

            // calculate for the youngest
            double youngest = Double.MAX_VALUE;
            String youngestName = "";
            for (int i = 0; i < age.length; i++) {
                if (youngest > age[i]) {
                    youngest = age[i];
                    youngestName = names[i];
                }
            }
            System.out.println("THE YOUNGEST ONE WITH THE AGE OF " + youngest + " IS : " + youngestName);

            //calculate for the tallest
            double tallest = Double.MIN_VALUE;
            String tallestName = "";
            for (int i = 0; i < height.length; i++) {
                if (tallest < height[i]) {
                    tallest = height[i];
                    tallestName = names[i];
                }
            }
            System.out.println("THE TALLEST ONE WITH THE HEIGHT OF " + tallest + " IS : " + tallestName);
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!");
        }
    }
}
