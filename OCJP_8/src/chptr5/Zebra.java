package chptr5;

public class Zebra extends Animal1 {
	public Zebra(int age) {
		super(age);
		System.out.println("In 1");
	}

	public Zebra() {
		this(4);
		System.out.println("In 2");
	}

	public static void main(String args[]) {
		new Zebra();
	}

}
