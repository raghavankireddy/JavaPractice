package warmup_3;

public class SeeColor {

	public static String testcase1 = "red";

	public static void main(String[] args) {

		SeeColor ob = new SeeColor();

		String result = ob.seeColor(testcase1);

		System.out.println("Result Is : " + result);
	}

	public String seeColor(String str) {

		if (str.startsWith("red")) {
			return "red";
		}
		if (str.startsWith("blue")) {
			return "blue";
		} else {
			return "";
		}

	}
}
