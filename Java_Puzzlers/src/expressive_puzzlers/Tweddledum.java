package expressive_puzzlers;

public class Tweddledum {

	public static void main(String[] args) {

		int x = 0;
		long i =123;
		
		x+=i;
		
		System.out.println(x);
		
		Object y = "Buy ";
		String w = "Effective Java";
		
		y=y+w;
		
		System.out.println(y);

		y+=w;
		System.out.println(y);

		
		System.out.println(w);
	}

}
