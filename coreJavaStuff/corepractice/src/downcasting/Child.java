package downcasting;

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
		

		// Downcasting 
		Child c=(Child)b;
		c.show();
		// Now u can call additional method of child class. 
		c.display();
	}

}

/*
 * Upcasting is mandatory, b4 u do downcasting
 * D process of demoting the ref-id of parent class to the child class, 
 * by the use of ref variable of parent class is known as Downcasting.
 */
