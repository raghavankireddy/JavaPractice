package first_Assignment;

import java.util.Scanner;

public class Fibbonaci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1,range=0,c=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range :");
		range=sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		// range -2, denotes that we have print 2 number earlier, so skipping it from printing again
		for(int i=1;i<=range-2;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		sc.close();
	}

}
