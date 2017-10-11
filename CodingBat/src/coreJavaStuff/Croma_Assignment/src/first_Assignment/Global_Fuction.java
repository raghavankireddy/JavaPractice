package first_Assignment;
import java.util.Scanner;

public class Global_Fuction {

 public int number;
	
	public int input_Number(int number){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		number=sc.nextInt();
		sc.close();
		return number;
		
	}
	
	public static void main(String[] args) {
		
	}

}
