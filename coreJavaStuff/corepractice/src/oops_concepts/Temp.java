package oops_concepts;

public class Temp {

	
	
	public Temp() {
		System.out.println("Default From Constructor");
	}
	
	public Temp(int x) {
		System.out.println("Paramaterized Constructor");
		System.out.println(x);
	}
	
	
	void Temp(){
		System.out.println("Hello From Function");
	}

	public static void main(String[] args) {
		
	
		new Temp().Temp();
		new Temp(50);

	}

}
