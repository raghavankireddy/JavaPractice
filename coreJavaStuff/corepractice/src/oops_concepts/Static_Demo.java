package oops_concepts;

public class Static_Demo {

	static void fun(){
		int x=5;
		System.out.println("Value Inside Static Block " + x);
	}
	
	void fun1(){
		int y=6;
		System.out.println("Value Outside Static Block " + y);	
	}
	
	
	
	public static void main(String[] args) {
	
		Static_Demo ob=new Static_Demo();
		
		Static_Demo.fun();
		ob.fun1();
		
	}

}
