package warmup_1;
/*
 * Given two non-negative int values, 
 * return true if they have the same last digit, such as with 27 and 57. 
 * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) : true
lastDigit(6, 17) : false
lastDigit(3, 113) : true
 * */
public class LastDigit_29 {

	static int testcase1=11;
	static int testcase2=27;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LastDigit_29 ob=new LastDigit_29();
		
		boolean result=ob.lastDigit(testcase1, testcase2);
		System.out.println("Result Is: "+result);
	}
	public boolean lastDigit(int a, int b) {
		  
		  if(a%10==b%10){
		  return true;
		  }
		  
		  else{
		  return false;
		  }
		  
		  
		  
		}


}
