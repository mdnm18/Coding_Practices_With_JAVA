/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * try(Scanner sc=new Scanner(System.in))
 * {
 * System.out.println("ENTER THE RADIUS OF A CIRCLE : ");
 * float r=sc.nextFloat();
 * float area=(float)(Math.PI*r*r);
 * System.out.print("THE AREA OF YOUR CIRCLE IS : "+area);
 * }
 * 
 * catch(InputMismatchException e)
 * {
 * System.out.print("PLEASE ENTER A VALID FLOAT NUMBER!");
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * char n='a';
 * char m='b';
 * int num1=n;
 * int num2=m;
 * System.out.println(num1);
 * System.out.println(num2);
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("ENTER YOUR AGE : ");
 * int age=sc.nextInt();
 * if(age<18)
 * {
 * System.out.println("YOU ARE A NON-ADULT ONE!");
 * }
 * if(age>=18&&age<=35)
 * {
 * System.out.println("YOU ARE A YOUNG ONE!");
 * }
 * else
 * {
 * System.out.println("YOU ARE AN OLD ONE!");
 * }
 * 
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println(": LETS CHECK OUT A NUMBER IS EITHER EVEN OR ODD :");
 * System.out.println("ENTER THE NUMBER : ");
 * int a=sc.nextInt();
 * String r=((a%2)==0)?"ENTERED NUMBER IS AN EVEN NUMBER."
 * :"ENTERED NUMBER IS AN ODD NUMBER.";
 * System.out.println(r);
 * 
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("CALCULATE ANY THING THAT YOU WANT!");
 * System.out.println("ENTER THE FIRST NUMBER : ");
 * int a=sc.nextInt();
 * System.out.println("ENTER THE SECOND NUMBER : ");
 * int b=sc.nextInt();
 * System.out.println("ENTER THE OPERATOR : ");
 * char op=sc.next().charAt(0);
 * switch(op)
 * {
 * case '+':System.out.println(a+b);
 * break;
 * case '-':System.out.println(a-b);
 * break;
 * case '*':System.out.println(a*b);
 * break;
 * case '/':System.out.println(a/b);
 * break;
 * default:System.out.println("YOU HAVE ENTERED A WORNG OPERATOR!");
 * }
 * 
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("LETS CHECK OUT A NUMBER IS EITHER POSITIVE OR NEGATION");
 * System.out.println("ENTER A NUMBER : ");
 * int a=sc.nextInt();
 * String r=(a>=0)?"ENTERED NUMBER IS POSITIVE":"ENTERED NUMBER IS NEGATIVE";
 * System.out.println(r);
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("ENTER YOUR BODY TEMPARATURE : ");
 * float a=sc.nextFloat();
 * String t=(a>=100)?"YOU HAVE FEVER.":"YOU HAVE NOT ANY FEVER";
 * System.out.println(t);
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("ENTER ANY WEAK NUMBER(1-7) : ");
 * int num=sc.nextInt();
 * switch(num)
 * {
 * case 1:System.out.println("SUNDAY");
 * break;
 * case 2:System.out.println("MONDAY");
 * break;
 * case 3:System.out.println("TUESDAY");
 * break;
 * case 4:System.out.println("WEDNESDAY");
 * break;
 * case 5:System.out.println("THURSDAY");
 * break;
 * case 6:System.out.println("FRIDAY");
 * break;
 * case 7:System.out.println("SATURDAY");
 * default:System.out.
 * println("YOU HAVE ENTERED A WORNG WEEK NUMBER! THAT EVEN DOES NOT EXITS." );
 * }
 * 
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println(": LETS CHECK A YEAR IS EITHER LEAP YEAR OR NOT :");
 * System.out.println("ENTER A YEAR : ");
 * int year=sc.nextInt();
 * boolean x=((year%4)==0);
 * boolean y=((year%100)!=0);
 * boolean z=((year%100)==0)&&((year%400)==0);
 * String r=(x&&(y||z))?"ENTERED YEAR IS A LEAP YEAR."
 * :"ENTERED YEAR IS NOT A LEAP YEAR.";
 * System.out.println(r);
 * }
 * 
 * }
 */
/*
 * import java.util.*;
 * pubilc class SRM
 * {
 * public static void main(String[] args)
 * {
 * int r=1;
 * while(r<=10)
 * {
 * System.out.println(r);
 * r++;
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * int r=1;
 * System.out.println("ENTER THE LAST NUMBER : ");
 * int l=sc.nextInt();
 * sc.close();
 * while(r<=l)
 * {
 * System.out.println(r);
 * r++;
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * int r=1;
 * int sum=0;
 * System.out.println("ENTER THE NUMBER : ");
 * int n=sc.nextInt();
 * while(r<=n)
 * {
 * sum+=r;
 * System.out.println("THE SUM OF"+n+"NATURAL NUMBER IS : "+sum);
 * r++;
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("ENTER A NUMBER OF WHICH REVERSE FORM YOU WANT TO SEE :  "
 * );
 * int n=sc.nextInt();
 * int lastdigit;
 * int rev=0;
 * System.out.println("THE REVERSE FORM OF"+n+"IS : ");
 * while(n>0)
 * {
 * lastdigit=n%10;
 * rev=rev*10+lastdigit;
 * n/=10;
 * }
 * System.out.print(rev);
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * while(true)
 * {
 * System.out.println("ENTER A NUMBER : ");
 * int n=sc.nextInt();
 * if(n%10==0)
 * {
 * continue;
 * }
 * System.out.println(n);
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("ENTER A NUMBER TO CHECK ITS TYPE- PRIME OR NON-PRIME : "
 * );
 * int n=sc.nextInt();
 * if(n<=2)
 * {
 * System.out.println("THE ENTERED NUMBER IS PRIME NUMBER.");
 * }
 * else
 * {
 * String isprime=" ";
 * for(int i=2;i<=Math.sqrt(n);i++)
 * {
 * isprime=((n%2)==0)?"THE ENTERED NUMBER IS A NON-PRIME NUMBER."
 * :"THE ENTERED NUMBER IS A PRIME NUMBER.";
 * }
 * System.out.println(isprime);
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * int n;
 * int choice;
 * int evensum=0;
 * int oddsum=0;
 * do
 * {
 * System.out.println("ENTER A NUMBER : ");
 * n=sc.nextInt();
 * if(n%2==0)
 * {
 * evensum+=n;
 * }
 * else
 * {
 * oddsum+=n;
 * }
 * System.out.
 * println("DO YOU WANT TO CONTINUE ?\n PRESS 1 FOR YES OR ANYTHING FOR NO.");
 * choice=sc.nextInt();
 * }while(choice==1);
 * System.out.println("THE SUM OF EVEN NUMMBER IS : "+evensum);
 * System.out.println("THE SUM OF ODD NUMBER IS : "+oddsum);
 * 
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.
 * println(" ENTER THE NUMBER TO GENERATE ITS MULTIPLICATION TABLE : ");
 * int n=sc.nextInt();
 * System.out.println("THE MULTIPLICATION TABLE OF "+n+" IS : ");
 * for(int i=1;i<=10;i++)
 * {
 * System.out.println(n+" * "+i+" = "+n*i);
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("ENTER A NUMBER TO SEE ITS FACTORIALS : ");
 * int n=sc.nextInt();
 * int f=1;
 * for(int i=1;i<=n;i++)
 * {
 * f*=i;
 * }
 * System.out.println("THE FACTORIAL OF "+n+" IS : "+f);
 * 
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.print("ENTER THE NUMBER OF LINE : ");
 * int n=sc.nextInt();
 * for(int lines=1;lines<=n;lines++)
 * {
 * for(int stars=1;stars<=lines;stars++)
 * {
 * System.out.print("*");
 * }
 * System.out.println(" ");
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.print("ENTER THE NUMBER OF LINES : ");
 * int n=sc.nextInt();
 * for(int lines=1;lines<=n;lines++)
 * {
 * for(int stars=1;stars<=(n-lines+1);stars++)
 * {
 * System.out.print("*");
 * }
 * System.out.println( " ");
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.print("ENTER THE NUMBER OF LINES : ");
 * int n=sc.nextInt();
 * for(int i=1;i<=n;i++)
 * {
 * for(int j=1;j<=i;j++)
 * {
 * System.out.print(j);
 * }
 * System.out.println( );
 * }
 * }
 * }
 */
/*
 * CHARACTER PATTERN
 * import java.util.*;
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.print("ENTER THE NUMBER OF LINES : ");
 * int n=sc.nextInt();
 * char ch='A';
 * for(int i=1;i<=n;i++)
 * {
 * for(int j=1;j<=i;j++)
 * {
 * System.out.print(ch);
 * ch++;
 * }
 * System.out.println();
 * }
 * }
 * }
 */
/*
 * import java.util.*;
 * public class SRM
 * {
 * public static int add(int a, int b)
 * {
 * int sum=a+b;
 * return sum;
 * }
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * System.out.println("ENTER THE FIRST NUMBER : ");
 * int x=sc.nextInt();
 * System.out.println("ENTER THE SECOND NUMBER : ");
 * int y=sc.nextInt();
 * int sum=add(x,y);
 * System.out.println("THE SUMMATION BETWEEN "+x+" AND "+y+" IS : "+sum);
 * }
 * }
 */
/*
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * int a=4;
 * int b=7;
 * int temp=a;
 * a=b;
 * b=temp;
 * System.out.println(a);
 * System.out.println(b);
 * }
 * 
 * }
 */
/*
 * public class SRM
 * {
 * public static void main(String args[])
 * {
 * System.out.println("HELLO WORLD!");
 * }
 * }
 */
