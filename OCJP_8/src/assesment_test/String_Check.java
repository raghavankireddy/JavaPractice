package assesment_test;

public class String_Check {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";

		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");

		// Literals always yield true
		System.out.println(s1 == s2);

		// It will always check the contents
		System.out.println(s1.equals(s2));

		// It will return false, based on String
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1);

		// It will always check the contents
		System.out.println(sb1.toString().equals(s1));

	}

}
