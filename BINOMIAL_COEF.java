import java.util.*;
public class BINOMIAL_COEF
{
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    public static int binomial(int n, int r)
    {
        int n_facto=factorial(n);
        int r_facto=factorial(r);
        int n_r_facto=factorial(n-r);
        int bc=n_facto/(r_facto*n_r_facto);
        return bc;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("LETS CALCULATE BINOMIAL COEFFICIENT : ");
        System.out.print("ENTER 'n' VALUE : ");
        int n=sc.nextInt();
        System.out.print("ENTER 'r' VALUE : ");
        int r=sc.nextInt();
        System.out.print("RESULT : ");
        System.out.print(binomial(n,r));
    }
}
