package oops_concepts;

public class Function_Overload_Example {
	
	void show(int x,long l){
		
		System.out.println("Value is coming from First Show Function");
		
	}
	
	void show(long l,int x){
		System.out.println("Value is coming from Second Show Function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function_Overload_Example ob=new Function_Overload_Example();
		
		ob.show(10,10l);
		ob.show(10l,10);
	}

}
