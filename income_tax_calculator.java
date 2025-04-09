import java.util.*;
public class income_tax_calculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR ANNUAL INCOME : ");
        float income=sc.nextFloat();
        sc.close();
        float tax,net_income;
        if(income<=500000)
        {
            tax=0;
            net_income=income-tax;
            System.out.println("YOU HAVE TO PAY 0% TAX IN YOUR ANNUAL INCOME. IT MEANS THAT YOU HAVE TO PAY (in INR) :"+tax);
            System.out.println("SO YOUR NET ANNUAL INCOME IS :"+net_income);
        }
        else if(income>500000 && income<=1000000)
        {
            tax=income*(0.2f);
            net_income=income-tax;
            System.out.println("YOU HAVE TO PAY 20% TAX IN YOUR ANNUAL INCOME. IT MEANS THAT YOU HAVE TO PAY (in INR) :"+tax);
            System.out.println("SO YOUR NET ANNUAL INCOME IS :"+net_income);
        }
        else
        {
            tax=income*(0.3f);
            net_income=income-tax;
            System.out.println("YOU HAVE TO PAY 30% TAX IN YOUR ANNUAL INCOME. IT MEANS THAT YOU HAVE TO PAY (in INR) :"+tax);
            System.out.println("SO YOUR NET ANNUAL INCOME IS :"+net_income);
        } 
    }
}
