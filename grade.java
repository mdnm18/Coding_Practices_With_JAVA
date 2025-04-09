import java.util.*;
public class grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR GRAND TOTAL MARKS :");
        int m=sc.nextInt();
        sc.close();
        String g=   (m>=90 && m<=100)? "YOUR GRADE : AA\nYOUR PERFORMANCE INDICATOR : OUTSTANDING!":
                    (m>=80 && m<=89)? "YOUR GRADE : A+\nYOUR PERFORMANCE INDICATOR : EXCELLENT!":
                    (m>=60 && m<=79)? "YOUR GRADE : A\nYOUR PERFORMANCE INDICATOR : VERY GOOD!":
                    (m>=45 && m<=59)? "YOUR GRADE : B+\nYOUR PERFORMANCE INDICATOR : GOOD!":
                    (m>=35 && m<=44)? "YOUR GRADE : B\nYOUR PERFORMANCE INDICATOR : SATISFACTORY!":
                    (m>=25 && m<=34)? "YOUR GRADE : C\nYOUR PERFORMANCE INDICATOR : MARGINAL!":
                                        "YOUR GRADE : D\nYOUR PERFORMANCE INDICATOR : DISQUALIFIED!";       
        System.out.println(g);
    }
}







