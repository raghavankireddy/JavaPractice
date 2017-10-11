package warmup_1;
/*
 * Given 2 int values, return true if one is negative and one is positive. 
 * Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) : true
posNeg(-1, 1, false) : true
posNeg(-4, -5, true) : true*/

public class PosNeg_8 {

	static int testcase1 = 1;
	static int testcase2 = -1;
	static boolean testcase3 = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PosNeg_8 ob=new PosNeg_8();
		boolean result=ob.posNeg(testcase1, testcase2, testcase3);
		System.out.println("Result Is -: " + result);
	}

	public boolean posNeg(int a, int b, boolean negative) {
		
		if( (a<0 && b<0) && (negative==true)){
			return true;
		}
		
		else if( (a>0 || b<0) && (negative!=true)){
			return true;
		}
		
		else{
			return false;
		}
	}
}
