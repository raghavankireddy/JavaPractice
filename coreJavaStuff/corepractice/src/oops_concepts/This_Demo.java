package oops_concepts;

public class This_Demo {

	//Instance Variable
	int x=10;
	
	//Case 1 - Normal Values

	void show(int y){
		System.out.println(x);
		System.out.println(y);
	}
	
	// Case 2
	// When ever a class level var & local var are having a same name, this concept is known as "Data Shadowing"
	
	void show1(int x){
		System.out.println(x);
		System.out.println(x);
	}
	
	// Case 3 & 4
	// Example of using this via Reference Var in the form of "This_Demo z"
	
	void show2(int y,This_Demo z){
		System.out.println(y);
		System.out.println(z.x);
	}
	
	// Case 5
	// Example of using this via Reference Var in the form of "This_Demo z"
		
	void show3(int y,This_Demo z){
		System.out.println(y);
		System.out.println(this.x);
		
	}
	
	// Case 6
	// This is the example that this keyword holds the refer var, bcoz it prints the same hashcode as the ref var name.
	
	void show4(){
		System.out.println(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This_Demo t= new This_Demo();
		// Case 1
		System.out.println("Case 1 Example");
		t.show(20);
		
		// Case 2
		System.out.println("Case 2 Example");
		t.show1(20);
		
		// Case 3
		System.out.println("Case 3 Example");
		t.show2(30, t);
		
		// Case 4 of This Keyword Via Ref Variable
		System.out.println("Case 4 Example");		
		System.out.println(t.x);
		
		// Case 5 of This Keyword 
		System.out.println("Case 5 Example");		
		t.show3(40, t);
		
		// Case 6 of Hashname Value 
		System.out.println("Case 6 Example");		
		t.show4();
		
		
		
		
		
	}

}
