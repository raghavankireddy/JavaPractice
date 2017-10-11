package warmup_2;

/*
 * Given a string and a non-negative int n, 
 * we'll say that the front of the string is the first 3 chars, 
 * or whatever is there if the string is less than length 3. 
 * Return n copies of the front;

 * frontTimes("Chocolate", 2) : "ChoCho"
 * frontTimes("Chocolate", 3) : "ChoChoCho"
 * frontTimes("Abc", 3) : "AbcAbcAbc"
 */

public class FrontTimes_2 {

	static String testcase1="Chocolate";
	static int testcase2=5;

	public static void main(String[] args) {

		FrontTimes_2 ob =new FrontTimes_2();
		
		String result = ob.frontTimes(testcase1, testcase2);
		
		System.out.println("Result Is :" + result);
		
	}
	
	public String frontTimes(String str, int n) {
	
		String substr="";

		int length = str.length();
		 
		if(length<3){
			  for (int i = 0; i < n; i++) {
				  substr = substr+str.substring(0, length);
			} 
		 }
		
		if(length>=3){
			  for (int i = 0; i < n; i++) {
				  substr = substr+str.substring(0, 3);
			} 
		  }
		  
		  return substr;
		}


}
