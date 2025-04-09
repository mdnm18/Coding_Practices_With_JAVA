
import java.util.*;

public class CopyArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS : ");
        int rows = sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMNS : ");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];
        int array[] = new int[rows * columns];
        System.out.println("ENTER THE ELEMENTS OF THE MATRIX : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        System.out.println("\n1D ARRAY : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        sc.close();
    }
}
