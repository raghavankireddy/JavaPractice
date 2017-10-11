package warmup_3;

public class FrontAgain {

	public static String testcase1 = "edited";

	public static void main(String[] args) {

		FrontAgain ob = new FrontAgain();
		boolean res = ob.frontAgain(testcase1);
		System.out.println("Result Is :" + res);
	}

	public boolean frontAgain(String str) {

		int flag = 0;

		if (str.length() > 0) {
			if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
				
				flag = 1;
			}
		}

		if (flag == 1) {
			return true;
		} else {
			return false;
		}

	}

}
