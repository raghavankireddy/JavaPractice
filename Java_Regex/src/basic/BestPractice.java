package basic;

import java.util.Optional;

public class BestPractice {

	public static final String SUCCESS="success";
	
	public static void main(String[] args) {

		String s = someOperations();
		
		if(SUCCESS.equals(s)){
			System.out.println("Operation Successfull");
		}
		else{
			System.out.println("Operation Fail");
		}
		
	}

	public static String someOperations() {
		return "success";
	}

}
