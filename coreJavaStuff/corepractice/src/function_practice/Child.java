package function_practice;

class Base{
	
	Base show(){
		System.out.println("Method Invocation from a Base Class");
		
		// In this case, it is returning an anonymous object
		return new Base(); 
	}
}


public class Child extends Base
{
	Child show(){
		System.out.println("Method Invocation from a Child Class");
		
		// You Can't Use Super Keyword under any static block, like in main function.
		super.show();
		
		// In this case, it is returning an anonymous object
		return new Child();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		c.show();
		
		/*Base b=new Child();
		b.show();
		*/
		
	}

}
