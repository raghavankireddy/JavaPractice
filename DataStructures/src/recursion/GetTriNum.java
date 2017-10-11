package recursion;

public class GetTriNum {

	// Sum of N Digits Number
	public static int testcase1 = 5;

	public static void main(String[] args) {

		GetTriNum ob = new GetTriNum();
		int result = ob.getTrinum(testcase1);
		System.out.println("The Result is :" + result );
	}

	public int getTrinum(int num) {

		if(num==1){
			return 1;
		} else{
		return num + getTrinum(num-1);	
		}
		
		
	}
}
