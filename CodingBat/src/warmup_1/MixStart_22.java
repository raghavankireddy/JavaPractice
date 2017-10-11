package warmup_1;

/*
 * Return true if the given string begins with "mix", 
 * except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") : true
mixStart("pix snacks") : true
mixStart("piz snacks") : false
 * */
public class MixStart_22 {

	static String testcase1="mix snacks";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MixStart_22 ob=new MixStart_22();
		boolean result = ob.mixStart(testcase1);
		System.out.println("Result Is : "+result);
	}
	
	public boolean mixStart(String str) {
		  
		
		  if(str.length()>=3 && str.substring(1,3).equals("ix")){
		  return true;
		  }
		  else{
		  return false;
		  }
		}

}
