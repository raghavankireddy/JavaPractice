package expressive_puzzlers;

public class IsOdd {

	public static int testcase1 = -1;
	public static void main(String[] args) {

		IsOdd ob = new IsOdd();
		boolean result = ob.isOdd(testcase1);
		
		System.out.println("Result is :" + result);
	}

	public boolean isOdd(int i){
		
		return i%2 != 0;
	}
}
