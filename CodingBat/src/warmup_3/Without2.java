package warmup_3;

public class Without2 {

	public static String testcase1 = "HilloHi";
	public static String testcase2 = "Hello";
	public static String testcase3 = "X";

	public static void main(String[] args) {

		Without2 ob = new Without2();
		String result = ob.without2(testcase3);

		System.out.println("Result Is :" + result);
	}

	public String without2(String str) {

		if (str.length() > 2) {

			if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) {
				return str.substring(2, str.length());
			}

		} else {

			if (str.length() == 1) {
				return str;
			}
			if (str.length() <= 2) {
				return "";
			}

		}

		return str;
	}

}
