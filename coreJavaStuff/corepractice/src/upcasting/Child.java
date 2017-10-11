package upcasting;

// In upcasting, the uniqueness is always checked in the parent class

class Base{
	void show(){
		System.out.println("Base Method");
	}
}

public class Child extends Base{
	
	void show(){
		System.out.println("Child Method");
	}
	
	void display(){
		System.out.println("Child Class Additional Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base b=new Child();
		b.show();
		
		/* This won;t compile, because it is the personal method of the Child class,
		 * which is undefined for the Base class, we can't use it via Base class reference
		*/
		
		//b.display();
		
		// This is happening due to default Constructor, and this is anonymous object in java
		new Base().show();
	}
}


/* The ref - id of a child class obj can be put into the reference variable of a parent class 
 * and this concept is known as Upcasting 
 * Note - Vice Versa is not true.
 */

