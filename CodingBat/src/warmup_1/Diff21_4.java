package warmup_1;

/*
 *Given an int n, return the absolute difference between n and 21, 
 *except return double the absolute difference if n is over 21.

diff21(19) : 2
diff21(10) : 11
diff21(21) : 0
*/

public class Diff21_4 {

	static int testCase1=19;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Diff21_4 ob=new Diff21_4();
		int result=ob.diff21(testCase1);
		System.out.println("Result Is -: "+result);
	}
	
	public int diff21(int n) {
		if(n<21){
			return (21-n);
		}
		else{
			return 2*(n-21);
		}
		
	}

}
