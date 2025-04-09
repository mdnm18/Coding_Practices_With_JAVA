import java.util.*;
public class oddEven{
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("ENTER THE UPPER LIMIT :");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++){
				if(i%2==0){
					System.out.println(i+" IS an Even Number");
				}
				else{
					System.out.println(i+" IS an ODD Number");
				}
			}
		}
		catch(InputMismatchException e){
			System.out.println("ERROR");
		}
	}
}

