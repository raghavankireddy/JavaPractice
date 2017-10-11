package Basics_1605;

public class Testing_Main_Again {

	public static void main(String[] args) {		
		System.out.println("Hello Java From First Main ");
		
		Test.main("fdfd","fdfdfeee","fdgdf");
	}

}

 class Test {
	
	 /*--  Here String is of variable length arguement type, that's why it is allowing to have 2 class and 2 main function -- */
	 
public static void main(String... arg) {
		
		System.out.println("Hello Java From Second Main In Other Way");	
	}	
}


