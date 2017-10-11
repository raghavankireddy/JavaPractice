package warmup_3;

public class StartWord {

	// hi
	public static String testcase1 = "hippo";
	public static String testcase2 = "i";

	// hip
	public static String testcase3 = "hippo";
	public static String testcase4 = "xip";

	// h
	public static String testcase5 = "hippo";
	public static String testcase6 = "i";

	// h
	public static String testcase7 = "h";
	public static String testcase8 = "ix";

	public static void main(String[] args) {

		StartWord ob = new StartWord();

		String result = ob.startWord(testcase5, testcase6);
		System.out.println("Result Is :" + result);

	}

	public String startWord(String str, String word) {

		if (str.length() == 0) {
			return "";
		}

		String first = str.substring(1, str.length());
		String second = word.substring(1, word.length());
		System.out.println("1 :-" + first);
		System.out.println("2 :-" + second+"?");

		if (str.startsWith(word)) {
			return str.substring(0, word.length());
		}

		else if (first.startsWith(second)) {
			return str.substring(0, word.length());
		}

		return "";
	}

}
