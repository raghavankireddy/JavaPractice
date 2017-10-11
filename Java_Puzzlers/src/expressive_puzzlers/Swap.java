package expressive_puzzlers;

public class Swap {

	public static void main(String[] args) {

		int x = 1984;
		int y = 2001;

//		x ^= y ^= x ^= y;
		
		//y =(x^= (y ^= x)) ^y;
		
		y=y^x;
		x=x^y;
		y=x^y;
		
		System.out.println("x = " + x + "; y = " + y );

	}

}
