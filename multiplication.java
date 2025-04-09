// Write a program to print the multiplication table of a number N, entered by the user.
/* 
import java.util.*;
public class multiplication
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF WHICH MULTIPLICATION TABLE YOU WANT TO SEE : ");
        int n=sc.nextInt();
        System.out.println("THE MULTIPLICATION TABLE OF "+n+" IS : ");
        for(int i=1;i<=10;i++)
        {
            System.out.println("                                        "+n+"*"+i+" = "+n*i);
        }
    }
}
*/

import java.util.*;
class MultiplicationTable {
public static void printMultiplicationTable(int number){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number:");
int n = sc.nextInt();
for(int i=1; i<=10; i++) {
System.out.println(n + " * " + i + " = " + n*i);
}
}
public static void main(String s[]) {
printMultiplicationTable(5);
}
}
