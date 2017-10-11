package warmup_1;
/*
 *Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 

or35(3) : true
or35(10) : true
or35(8) : false
*/

public class Or35_14 {

	static int testcase1=35;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Or35_14 ob=new Or35_14();
		boolean result=ob.or35(testcase1);
		System.out.println("Result Is -: "+result);
		
	}
	
	public boolean or35(int n) {
	
		if((n%5==0) || (n%3==0)){
			  return true;
		}
			else{
			  return false;
			}
	}


}
