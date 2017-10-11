package chptr3;

public class RopeSwing {
	
	private static Pope rope1 = new Pope();
	private static Pope rope2 = new Pope();
	{
		System.out.println(rope1.length);
	}

	public static void main(String[] args) {
		rope1.length = 2;
		rope2.length = 8;
		new RopeSwing();
		System.out.println(rope2.length);
	}

}
