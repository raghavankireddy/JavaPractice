package upcasting;

class Basebase
{
	int x=10;
	void show(){
		System.out.println("Base");
	}
}


public class Data_Hiding_Via_Upcasting extends Basebase{

	int x=25;
	
	void show(){
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basebase bb=new Data_Hiding_Via_Upcasting();
		System.out.println(bb.x);
		bb.show();
	}

}
// Priority always goes to Base Class