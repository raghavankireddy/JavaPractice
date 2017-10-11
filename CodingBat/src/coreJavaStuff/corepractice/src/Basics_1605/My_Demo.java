package Basics_1605;

public class My_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My_Demo ob=new My_Demo();
		
		ob.myName("Karanjeet");
		ob.myName("Karanjeet","Singh");
		
				
	}
	
	
	public void myName(String name){
	
		System.out.println("Name " + name);
	}

	public void myName(String fname,String lname)
	{
		System.out.println("Name " + fname + " " + lname);
		
		
	}
	
	
}
