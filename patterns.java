import java.util.*;

public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF PATTERN'S LINES THAT YOU WANT TO SEE IN YOUR PATTERN : ");
        int n = sc.nextInt();
        for (int lines = 1; lines <= n; lines++) {
            for (int stars = 1; stars <= lines; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
