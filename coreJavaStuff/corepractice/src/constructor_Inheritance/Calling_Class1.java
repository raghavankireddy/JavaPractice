package constructor_Inheritance;

class Aa{
	
	Aa(){
		//super();
		System.out.println("Class Aa");	
	}
	
}

class Bb extends Aa{
	int x;
	
	Bb(){
		//super();
		x=40;
	}
	
}



public class Calling_Class1 extends Bb{

	public Calling_Class1() {
		//super();
		System.out.println("Value of Bb " + x);
	}

	public Calling_Class1(int x) {
		//super();
		System.out.println("Value of Calling Class1 " + x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Calling_Class1();
		new Calling_Class1(50);
	}

}

// No difference by using super()
 

