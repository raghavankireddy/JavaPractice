package warmup_3;

public class LastTwo {

	public static String testcase1 = "coding";

	public static void main(String[] args) {

		LastTwo ob = new LastTwo();

		String result = ob.lastTwo(testcase1);

		System.out.println(result);
	}

	public String lastTwo(String str) {

		if (str.length() == 1) {
			return str;
		}
		if (str.length() > 0) {
			return str.substring(0, str.length() - 2) + str.substring(str.length() - 1, str.length())
					+ str.substring(str.length() - 2, str.length() - 1);
		} else {
			return "";
		}
	}

}
