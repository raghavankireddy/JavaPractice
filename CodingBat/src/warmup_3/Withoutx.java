package warmup_3;

public class Withoutx {

	public static String testcase1 = "xHix";
	public static String testcase2 = "xHi";
	public static String testcase3 = "Hi";

	public static void main(String[] args) {

		Withoutx ob = new Withoutx();

		String result = ob.withoutX(testcase1);

		System.out.println("Result Is : " + result);
	}

	public String withoutX(String str) {

		if (str.length() == 1) {
			return "";
		}

		String str1 = "";

		if (str.length() > 0) {

			if (str.startsWith("x") && str.endsWith("x")) {
				str1 = str.substring(1, str.length() - 1);
			}

			else if (str.endsWith("x")) {
				str1 = str.substring(0, str.length() - 1);
			}

			else if (str.startsWith("x")) {
				str1 = str.substring(1, str.length());
			} else {
				str1 = str;
			}
		}

		return str1;

	}

}
