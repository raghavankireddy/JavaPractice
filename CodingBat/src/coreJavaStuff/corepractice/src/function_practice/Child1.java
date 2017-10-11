package function_practice;

class Base1{
	
	void show(){
		System.out.println("Method Invocation from a Base Class");
		}
}


public class Child1 extends Base1
{
	
	/* In the previous example, by changing the return type, it is not showing any error
	and here if i change, it is throwing an error. */ 
	
	/*int show(){
	}*/
	
	
	void show(){
		
		System.out.println("Method Invocation from a Child Class");
		
		// You Can't Use Super Keyword under any static block, like in main function.
		super.show();
		
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c=new Child1();
		c.show();
		
		/*Base b=new Child();
		b.show();
		*/
		
	}

}
