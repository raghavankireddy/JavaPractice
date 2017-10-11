package assesment_test;

public class Cougar extends Puma {

	public static void main(String[] args) {

		Puma ob = new Cougar();
		System.out.println(ob.getTailLength());
		
	}
	
	public int getTailLength() {
		return 2;
	}

}
