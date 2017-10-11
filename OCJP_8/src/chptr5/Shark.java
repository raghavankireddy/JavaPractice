package chptr5;

public class Shark extends Fish {

	private static int noofcoffins = 8;

	public Shark(int age) {
		super(age);
		this.size = 4;
	}

	public void display() {
		System.out.println("Shark with age : " + this.getAge());
		
		System.out.println("Shark with age : " + this.size);
		System.out.println("Shark with age : " + this.noofcoffins);
		System.out.println("Shark with age : " + super.size);
		System.out.println("Shark with age : " + super.getAge());
		
		
		
		
		
	}

	public static void main(String[] args) {

		Shark ob = new Shark(7);

	
		ob.display();

		System.out.print(" and " + size + " meters long");
		System.out.print(" with " + noofcoffins + " Fins");

	}

}
