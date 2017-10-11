package Basics_1605;

public class My_Demo_Child extends My_Demo {

	public My_Demo_Child()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My_Demo ob=new My_Demo_Child();
		
		ob.myName("Karan");
	}
	
	
	@Override
	public void myName(String name) {
		// TODO Auto-generated method stub
		super.myName(name);
		System.out.println("I have modified");
	}

}
