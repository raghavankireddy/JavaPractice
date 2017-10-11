package constructor_Inheritance;

class A{
	
	A(){
		System.out.println("Class A");	
	}
	
}

class B extends A{
	int x;
	B(){
		System.out.println("Class B");
		x=40;
	}
	
}


public class Calling_Class extends B{

	public Calling_Class() {
		System.out.println("Calling Class");
		System.out.println("Value of Constructor B " + x);
	}
	
	public Calling_Class(int x) {
		System.out.println("Value of Constructor Calling class " + x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new Calling_Class();
		new Calling_Class(10);
	}

}


/*
 * Here it is an example of constructor inheritance,
 * where we called Calling class, that invokes Class B, which further invokes class A
 * then when we called parameterized constructor, it happens again.
 * It is known as Constructor Inheritance
*/

/*
 * From Sant Manish Bhatia 
 * Whenever a child class Const. runs, it has to execute immediate parent class Const. first,
 * then itself, if somehow a child class Const. is not capable to execute the parent class Const. first,
 * then it cannot cal itself
 * 
 *  G.Rule - Every class is a child of a Object Class in Java, Compiler automatically put the extends
 *  keyword, which is deriving from Object.
 */
