/**
 * 
 */
package oops_concepts;


public class Constructor_Chaining {
	
	// We can use static or non-static data member both
	int num=101;

	// Init Block is formed inside the class
	
	{
	System.out.println(num);	
	System.out.println("Init Block");
	System.out.println("Value of a ref-var -> "+this);
	}
	
	// this() will invoke --> this(10) --> this(20,25), Value from third --> then from second --> from first.
	
	
	public Constructor_Chaining() {
		this(10);
		System.out.println("Value from First Constructor");
		System.out.println("Default");
		
		
	}

	public Constructor_Chaining(int x){
		this(20,25);
		System.out.println("Value from Second Constructor");
		System.out.println(x);
	}
	
	public Constructor_Chaining(int x,int y){
		System.out.println("Value from Third Constructor");
		System.out.println(x+y);
		

	}
	
	
	// Init Block is always first executed, Hence Proved
	{
		System.out.println(num+20);
		System.out.println("Second Init Block");
		System.out.println("Value of a ref-var -> "+this);

	}
		
	
	public static void main(String[] args) {

		// Anonymous Object
		
		new Constructor_Chaining();
		
	
	}

}
