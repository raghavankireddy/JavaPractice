package fourth2b;

public class PalindromeString {


	static String testcase1 = "maDam";
	
	public static void main(String[] args) {
		PalindromeString testInstance= new PalindromeString();
		boolean result = testInstance.isPalindrome(testcase1);
		System.out.println(result);
	

	}
	
	public boolean isPalindrome(String str){
		
		char ch1;
		int i=0;
		String s="";
		
		for(i=str.length()-1;i>=0;i--){
			ch1=str.charAt(i);
			s=s+ch1;
		}
		
		if( (str.equalsIgnoreCase(s)) ){
			return true;
		}
		else
			return false;
		
		

}
}
