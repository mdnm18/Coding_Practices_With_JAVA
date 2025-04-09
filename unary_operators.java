import java.util.*;
public class unary_operators
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        //b=++a; //PRE-INCREMENT UNARY OPERATOR.
        //b=a++; //POST-INCREMENT UNARY OPERATOR.
        //b=--a; //PRE-DICREMENT UNARY OPERATOR.
        b=a--;//POST-DICREMENT UNARY OPERATOR.
        System.out.println(a);
        System.out.println(b);
    }  
}
