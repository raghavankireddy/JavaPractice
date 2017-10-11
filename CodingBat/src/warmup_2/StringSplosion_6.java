package warmup_2;

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") : "CCoCodCode"
stringSplosion("abc") : "aababc"
stringSplosion("ab") : "aab"
 * 
 * */

public class StringSplosion_6 {

	static String testcase1="Code";
	static String testcase2="abc";
	
	
	public static void main(String[] args) {

		StringSplosion_6 ob = new StringSplosion_6();
		
		String result = ob.stringSplosion(testcase2);
		System.out.println("Result Is :" + result);
		
	}
	
	public String stringSplosion(String str) {
		  

	    String result="";
			  
			  for(int i=0;i<str.length();i++){
			    result = result + str.substring(0,i+1);
			  }
			  return result;
			}


	

}
