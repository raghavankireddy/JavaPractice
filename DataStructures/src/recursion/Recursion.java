package recursion;

public class Recursion {

	public static int testcase1 = 5;

	// Demonstrate what a triangular number is
	// Triangular numbers can be visualized as triangles
	// Equals itself plus every number before it to 1
	// TN of 5 = 5+4+3+2+1

	public static void main(String[] args) {

		Recursion ob = new Recursion();

		// int result = ob.getTriNum(6);
		// System.out.println("Result Is : " + result);
		//
		// int result1 = ob.getTriNumRecursion(6);
		// System.out.println("Result Is With Recursion : " + result1);

		int result3 = ob.getFactorial(testcase1);
		System.out.println("Factorial of :" + testcase1 + " :->" + result3);
	}

	// Without using Recurision

	public int getTriNum(int number) {

		int trinum = 0;

		while (number > 0) {
			trinum += number;
			number--;
		}

		return trinum;
	}

	public int getTriNumRecursion(int num) {

		if (num == 1) {
			System.out.println("Returned 1");
			return 1;
		}

		else {
			return num + getTriNumRecursion(num - 1);
		}

	}

	public int getFactorial(int number) {
		if (number == 1) {
			System.out.println("Returned 1");
			return 1;
		} else {
			int result = number * getFactorial(number - 1);
			System.out.print("Returned " + result);

			System.out.println(":" + " + number " + " * getFact(" + number + "- 1 )");

			return result;
		}

	}

}
