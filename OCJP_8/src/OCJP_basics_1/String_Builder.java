package OCJP_basics_1;

public class String_Builder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("animals");

		sb.insert(7, "-");
		System.out.println(sb);

		
		sb.insert(0, "-");
		System.out.println(sb);

		
		sb.insert(4, "-");
		System.out.println(sb);
		

	}

}
