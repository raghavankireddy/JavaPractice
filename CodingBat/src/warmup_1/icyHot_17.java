package warmup_1;
/*
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.

icyHot(120, -1) : true
icyHot(-1, 120) : true
icyHot(2, 120) : false
 * 
 */

public class icyHot_17 {
	
	static int testcase1=2;
	static int testcase2=120;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		icyHot_17 ob=new icyHot_17();
		boolean result=ob.icyHot(testcase1, testcase2);
		System.out.println("Result Is -: "+result);
	}
	
	public boolean icyHot(int temp1, int temp2) {
		  
		  if( (temp1<0 && temp2 >100) || (temp1>100 && temp2 <0) )
		  {return true;
		  }
		  
		  else{
		  return false;
		  }
		  
		}


}
