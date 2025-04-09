
import java.util.Scanner;

public class p16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs for personal and travel details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your starting city (fromCity): ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city (viaCity): ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your final destination (toCity): ");
        String toCity = scanner.nextLine();

        // Taking distance inputs
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        // Taking time taken input
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();

        // Taking fee and discount percentage
        System.out.print("Enter the travel fee: ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculating total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Calculating discount amount
        double discountAmount = (discountPercent / 100) * fee;

        // Calculating final amount after discount
        double finalAmount = fee - discountAmount;

        // Understanding operator precedence
        int result1 = (int) (fee / discountPercent + timeTaken); // Example of operator precedence
        int result2 = (int) (fee - discountAmount * 2); // Another example
        int result3 = (int) (totalDistance / timeTaken); // Speed calculation as an example

        // Displaying the results
        System.out.println("\nTravel Summary:");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time Taken: " + timeTaken + " hours");
        System.out.println("Original Fee: $" + fee);
        System.out.println("Discount: " + discountPercent + "% (Amount: $" + discountAmount + ")");
        System.out.println("Final Fee after Discount: $" + finalAmount);

        System.out.println("\nThe results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
        scanner.close();
    }
}
