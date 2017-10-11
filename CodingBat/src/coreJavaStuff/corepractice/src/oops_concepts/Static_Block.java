package oops_concepts;

public class Static_Block {

	// Static Block
	static
	{
		System.out.println("Static Block");
	}
	
	// Init Block
		
	{
		System.out.println("Init Block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Use for Executing Init Block
		new Static_Block();
		
		
		System.out.println("Main Block");
		

	}

}
