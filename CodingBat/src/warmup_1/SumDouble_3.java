package warmup_1;

/*Given two int values, return their sum. 
  Unless the two values are the same, then return double their sum.

sumDouble(1, 2) : 3
sumDouble(3, 2) : 5
sumDouble(2, 2) : 8
*/


public class SumDouble_3 {

	static int testCase1=4;
	static int testCase2=4;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumDouble_3 ob=new SumDouble_3();
		int result=ob.sumDouble(testCase1, testCase2);
		System.out.println("Result Is -: "+result);
				
	}
	
	public int sumDouble(int a, int b) {
		if(a!=b){
			return (a+b);
		}
		else{
			return 2*(a+b);
		}
	}

}
