package assesment_test;

public class Deer {

	public Deer(){
		System.out.print("Deer");
	}
	
	public Deer(int age){
		System.out.print("DeerAge");
	}
	
	private boolean hasHorns(){
		return false;
	}
	
	public static void main(String args[]){
		
		Deer ob = new Reindeer(6);
		System.out.println("," + ob.hasHorns()) ;
		
		Deer obj =new Deer(9);
		System.out.println(" ," + obj.hasHorns());
	}
	
	
}
