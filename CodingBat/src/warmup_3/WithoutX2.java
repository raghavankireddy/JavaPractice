package warmup_3;

public class WithoutX2 {

	public static String testcase1 = "xHi";
	public static String testcase2 = "xHxi";
	public static String testcase3 = "xx";

	public static void main(String[] args) {

		WithoutX2 ob = new WithoutX2();

		String result = ob.withoutX2(testcase1);
		System.out.println("Result Is :" + result);
	}

	public String withoutX2(String str) {

		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) != 'x')
				temp += str.charAt(i);
			else if (i == 1 && str.charAt(i) != 'x')
				temp += str.charAt(i);
			else if (i > 1)
				temp += str.charAt(i);
		}

		return temp;

	}

}
