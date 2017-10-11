package warmup_1;
/*
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 * Given 3 int values, return true if 1 or more of them are teen. 
 *
hasTeen(13, 20, 10) : true
hasTeen(20, 19, 10) : true
hasTeen(20, 10, 13) : true
*/

public class HasTeen_19 {
	
	static int testcase1=10;
	static int testcase2=10;
	static int testcase3=13;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HasTeen_19 ob=new HasTeen_19();
		boolean result=ob.hasTeen(testcase1, testcase2, testcase3);
		System.out.println("Result Is : "+result);
	}

	public boolean hasTeen(int a, int b, int c) {

		 if( (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)  )
		 {
		 return true;
		 }
		 else
		 {
		 return false;
		 }
		   
		}

}
