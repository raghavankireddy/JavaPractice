package oops_concepts;

public class Constructor_Chaining1 {

	public Constructor_Chaining1(int x,int y){
		
		System.out.println("Third Constructor");
		System.out.println(x+y);
	}

	public Constructor_Chaining1(int x){
		this(10,26);
		System.out.println("Second Constructor");
		System.out.println(x);
	}
	
	public Constructor_Chaining1() {
		this(10);
		System.out.println("First Constructor");
		System.out.println("Default");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Constructor_Chaining1();
	}

}
