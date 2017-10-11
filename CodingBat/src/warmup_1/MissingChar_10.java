package warmup_1;
/*
 * Given a non-empty string and an int n, 
 * return a new string where the char at index n has been removed. 
 * The value of n will be a valid index of a char in the original string 
 * (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) : "ktten"
missingChar("kitten", 0) : "itten"
missingChar("kitten", 4) : "kittn"
 * */
public class MissingChar_10 {

	static String testcase1="Kitten";
	static int testcase2=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MissingChar_10 ob=new MissingChar_10();
		String result=ob.missingChar(testcase1,testcase2);
		System.out.println("Result Is -: " + result);
	}

	public String missingChar(String str, int n) {
		
		String front = str.substring(0, n);
		  
		  // Start this substring at n+1 to omit the char.
		  // Can also be shortened to just str.substring(n+1)
		  // which goes through the end of the string.
		  
		String back = str.substring(n+1, str.length());
		  
		  return front + back;
	}
}
