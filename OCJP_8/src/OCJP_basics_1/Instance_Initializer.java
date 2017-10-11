package OCJP_basics_1;

public class Instance_Initializer {

	// Instance initializer Blocks -1

	{
		// This code is executed before every constructor.
		System.out.println("Common part of constructors invoked !! - Part 1");
	}

	public Instance_Initializer(){
		System.out.println("Default Constructor Invoked !!");
	}
	
	public Instance_Initializer(int x){
		System.out.println("Parameterized Constructor Invoked !!");
	}
	
	
	
	public static void main(String[] args) {

		Instance_Initializer ob1,ob2;
		
		ob1 = new Instance_Initializer();
		ob2 = new Instance_Initializer(4);
	}

	// Instance initializer Blocks -2

	{
		// This code is executed before every constructor.
		System.out.println("Common part of constructors invoked !! - Part 2");
	}
}
