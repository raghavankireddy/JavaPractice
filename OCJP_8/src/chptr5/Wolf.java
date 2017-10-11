package chptr5;

public class Wolf extends Canine {

	public double getAverageWeight() {
		return super.getAverageWeight() + 30;
	}

	public static void main(String[] args) {

		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
		

	}

	private int eat(int food) { 
		System.out.println("Bird is eating " + food + " units of food");
		return food;
	}
}
