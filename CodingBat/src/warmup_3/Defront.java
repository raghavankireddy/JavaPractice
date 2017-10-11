package warmup_3;

public class Defront {

	// llo
	public static String testcase1 = "Hello";
	// va
	public static String testcase2 = "java";
	// aay
	public static String testcase3 = "away";
	// bay
	public static String testcase4 = "sbay";
	// abay
	public static String testcase5 = "abay";

	public static void main(String[] args) {

		Defront ob = new Defront();

		String result = ob.deFront(testcase5);

		System.out.println("Result Is :" + result);

	}

	public String deFront(String str) {

		if (str.length() > 0) {

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
					return str.charAt(i) + "" + str.charAt(i + 1) + str.substring(2, str.length());
				}
				if (str.charAt(i) == 'a' && str.charAt(i + 1) != 'b') {
					return str.charAt(i) + str.substring(2, str.length());
				}
				if (str.charAt(i) != 'a' && str.charAt(i + 1) == 'b') {
					return str.charAt(i + 1) + str.substring(2, str.length());
				}
				if (str.charAt(i) != 'a' && str.charAt(i + 1) != 'b') {
					return str.substring(2, str.length());
				}

			}
		}

		return str;
	}

}
