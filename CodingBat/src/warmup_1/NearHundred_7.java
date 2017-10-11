package warmup_1;
/*
 *Given an int n, return true if it is within 10 of 100 or 200. 
 *Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) : true
nearHundred(90) : true
nearHundred(89) : false
 * */
public class NearHundred_7 {
	
	static int testcase1=99;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NearHundred_7 ob=new NearHundred_7();
		boolean result=ob.nearHundred(testcase1);
		System.out.println("Result Is-: "+result);
	}

	public boolean nearHundred(int n) {
		  
		int diffn1=0,diffn2=0;
		  
		  if(n==0 || n==290){
			  return false;
		  }
		  
			  else if(n%10==0)
			  {
				  return true;
			  }
		  
				  else if(n<100){
					  diffn1=100-n;
				    if(diffn1<=10){
				    	return true;
				    	}    
				    	else{
				    		return false;
				    	}
				  }
		  
					  else if(n>100 && n<200){
						  diffn2=200-n;
					    if(diffn2<=10){
					    	return true;
					    	}
					    	else{
					    		return false;
					    		}
					  }
		  
		  else
		  {return false;}

	}
}
