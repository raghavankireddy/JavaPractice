package chptr5;

public class Lion extends Animal {

	public static void main(String[] args) {

		Lion obj = new Lion();
		obj.roar();
	}

	public void roar() {
		System.out.println("The " + getAge() + " year old ");
	}

}
