
import java.util.*;

public class calculatorSwitchCase {

    public static void main(String[] args) {
        double result = 0;
        char continueCalc = 'n'; // Initialize with a default value

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Enter the first number:");
                double num1 = sc.nextDouble();
                sc.nextLine(); // Consume the newline character
                System.out.println("Enter the second number:");
                double num2 = sc.nextDouble();
                sc.nextLine(); // Consume the newline character
                System.out.println("Choose an operation: +, -, *, /");
                char operator = sc.nextLine().charAt(0);
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error! Division by zero.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Error! Invalid operator.");
                        continue;
                }

                System.out.println("The result is: " + result);

                System.out.println("Do you want to perform another calculation? (y/n)");
                continueCalc = sc.nextLine().charAt(0);
            } while (continueCalc == 'y');

            System.out.println("Calculator program has ended.");
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT !");
        }
    }
}
