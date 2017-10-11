package OCJP_basics_1;

public class StringCheck {

	public static void main(String[] args) {

		String x = "Java";

		String y = " Java ".trim();

		
		System.out.println("Value  :-  " + (x==y));

		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two);
		System.out.println(one == three);
		
		
		StringBuilder sb = new StringBuilder("ABC");
		StringBuilder sb1 = new StringBuilder("ABC");
		
		System.out.println("SB : " + (sb==sb1));
		
		// String builder has not implemented equals()
		System.out.println("SB with equals() : " + (sb.equals(sb1)));
		
		
		StringBuilder sb2=sb1;
		System.out.println("SB : " + (sb2==sb1));
		
	}

}
