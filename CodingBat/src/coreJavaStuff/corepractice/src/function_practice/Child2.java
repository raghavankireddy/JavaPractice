package function_practice;

class Base2{
	
	private int i=5;
	
	// Weak to Strong is allowed, like in this case we have protected Base class, and public Child class, so it is valid,
	// Note - Vice versa won't be possible
	
	protected void show(){
		System.out.println("Method Invocation from a Base Class");
	}
}


public class Child2 extends Base2
{
	
	// Even there is no role of specifier also. !!
	 public void show(){
		System.out.println("Method Invocation from a Child Class");
		
		// You Can't Use Super Keyword under any static block, like in main function.
		super.show();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child2 c=new Child2();
		c.show();
	
		
		/*Base b=new Child();
		b.show();
		*/
		
	}

}
