
import java.util.*;

public class NegPosiZeroEvenOddEqualGreaterLess {

    public static void input(int num[], Scanner sc) {
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num[] = new int[5];
            System.out.println("ENTER THE 5 NUMBERS : ");
            input(num, sc);
            String r = "";
            for (int i = 0; i < num.length; i++) {
                if (num[i] > 0) {
                    System.out.println(num[i] + " IS A POSITIVE ELEMENT");
                    r = (num[i] % 2 == 0) ? num[i] + " IS AN EVEN ELEMENT" : num[i] + " IS AN ODD ELEMENT";
                    System.out.println(r);
                } else if (num[i] < 0) {
                    System.out.println(num[i] + " IS A NEGATIVE ELEMENT");
                } else {
                    System.out.println(num[i] + " IS A ZERO ELEMENT");
                }
            }

            String p = (num[0] == num[4]) ? "THE FIRST & LAST ELEMENTS ARE EQUAL WITH EACH OTHERS" : (num[0] > num[4]) ? "THE FIRST ELEMENT IS GREATER THEN THE LAST ELEMENT" : "THE FIRST ELEMENT IS LESSER THEN THE LAST ELEMENT";
            System.out.println(p);

        } catch (InputMismatchException e) {
            System.err.println("INVALID INPUT!");
        }
    }
}
