package warmup_1;

/*
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
makes10(9, 10) : true
makes10(9, 9) : false
makes10(1, 9) : true
* */
public class Makes10_6 {

	static int testCase1=9;
	static int testCase2=9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Makes10_6 ob=new Makes10_6();
		boolean result=ob.makes10(testCase1, testCase2);
		System.out.println("Result Is -: "+result);
	}

	public boolean makes10(int a, int b) {
		if( (a+b==10) || (a==10 || b==10) ){
			return true;
		}
		else{
			return false;
		}
	}
}
