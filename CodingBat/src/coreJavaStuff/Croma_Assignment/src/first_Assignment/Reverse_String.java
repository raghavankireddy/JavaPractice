package first_Assignment;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String s=sc.next();
		
		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		
		System.out.println("The Reverse String is :" + s1);
		sc.close();
	}

}
