import java.util.*;
public class HOLLOW_RACTANGLE 
{
    public static void H_R(int total_rows, int total_cols)
    {
        for(int i=1;i<=total_rows;i++)
        {
            for(int j=1;j<=total_cols;j++)
            {
                if(i==1 || i==total_rows || j==1 || j==total_cols)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE TOTAL NO. OF ROWS : ");
        int r=sc.nextInt();
        System.out.print("ENTER THE TOTAL NO. OF COLUMNS : ");
        int c=sc.nextInt();
        sc.close();
        H_R(r,c);
    }
}
