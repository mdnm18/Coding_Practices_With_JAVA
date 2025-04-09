import java.util.*;
public class BINTODEC 
{
    public static void BinToDec(int binnum)
    {
        int mynum=binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0)
        {
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binnum/=10;
        }
        System.out.print("DECIMAL NUMBER OF "+mynum+" IS = "+decnum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A BINNARY NUMBER : ");
        int n=sc.nextInt();
        BinToDec(n);
    }
}
