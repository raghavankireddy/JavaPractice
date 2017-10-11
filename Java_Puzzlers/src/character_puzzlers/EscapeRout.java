package character_puzzlers;

public class EscapeRout {

	public static void main(String[] args) {

		// \u0022 is the Unicode escape for Double Quotes (")
		
		System.out.println("a\u0022.length() + \u0022b".length());
		
		System.out.println("a".length() + "b".length());
		
		char c = '\u0022';
	
		System.out.println(c);
		
		String uniCode = "\"u0022\"";
		System.out.println(uniCode);
		
		System.out.println(5==5.00);
		
		int x = 0;
		long y = 0;
		for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
		System.out.println(y + " ");
		}
		
		System.out.println(x);
		
	}
	

}
