package abstractExample;

public class Lemur extends Primate implements HasTail {

	@Override
	public boolean isTripped() {
		return false;
	}

	public int age = 10;

	public static void main(String args[]) {
		Lemur lem = new Lemur();
		System.out.println(lem.age);

		Primate prim = lem;
		System.out.println(prim.hasHair());

		HasTail hs = lem;
		System.out.println(hs.isTripped());
	}

}
