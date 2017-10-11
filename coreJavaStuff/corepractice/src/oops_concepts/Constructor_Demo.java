package oops_concepts;

public class Constructor_Demo {

	int x;
	
	public Constructor_Demo() {
		// TODO Auto-generated constructor stub
		System.out.println(this);	
		this.x=10;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_Demo ob=new Constructor_Demo();
		
		
		System.out.println(ob.x);
		
	}

}
