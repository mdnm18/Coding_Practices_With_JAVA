/* 
import java.util.*;
public class gst
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE PRICE OF PENCIL :");
        float a=sc.nextFloat();
        System.out.println("ENTER THE PRICE OF PEN :");
        float b=sc.nextFloat();
        System.out.println("ENTER THE PRICE OF ERASER :");
        float c=sc.nextFloat();
        float sum=a+b+c;
        System.out.println("THE TOTAL PRICE WITHOUT GST AMOUNT IS : "+sum);
        System.out.println("ENTER THE GST RATE (IN DECIMAL-POINT NUMBER) : ");
        float p=sc.nextFloat();
        float gst=(sum*p)/100f;
        float net=sum+gst;
        System.out.println("THE TOTAL NET PRICE WITH GST AMOUNT IS : "+net);
        sc.close();
    }
}
*/
import java.util.Scanner;

public class GSTCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int numProducts = sc.nextInt();

        float totalCost = 0;
        float totalGST = 0;

        for (int i = 1; i <= numProducts; i++) 
        {
            System.out.println("Product " + i + ":");
            System.out.print("Enter the cost price: ");
            float costPrice = sc.nextFloat();

            System.out.print("Enter the GST rate (%): ");
            float gstRate = sc.nextFloat();

            float gstAmount = (costPrice * gstRate) / 100;
            float totalPrice = costPrice + gstAmount;

            System.out.println("GST amount for Product " + i + ": " + gstAmount);
            System.out.println("Total price for Product " + i + ": " + totalPrice);

            totalCost += costPrice;
            totalGST += gstAmount;
        }

        System.out.println("\nSummary:");
        System.out.println("Total cost of all products: " + totalCost);
        System.out.println("Total GST amount: " + totalGST);
        System.out.println("Total price (including GST): " + (totalCost + totalGST));

        sc.close();
    }
}

