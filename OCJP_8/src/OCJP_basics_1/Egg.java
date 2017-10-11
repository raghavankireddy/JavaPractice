package OCJP_basics_1;

public class Egg {

	int count;

	public Egg() {
		number = 50;
		count = 3;
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
		System.out.println(egg.count);

		System.out.println(5 == 5.00);

		int y = 10;
		final int x;
		if (y > 15) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}

		System.out.println(x);
		System.out.println((y > 50) ? 21 : "Zebra");
	}

	private int number = 3;
	{
		number = 4;
	}

}
