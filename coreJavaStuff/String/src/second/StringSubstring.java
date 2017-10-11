package second;

public class StringSubstring {
	static String testcase1 = "abcdefabcd";
	static int testcase2 = 4;
	

	public static void main(String[] args) {
		StringSubstring testInstance = new StringSubstring();
		String result = testInstance.newSubstring(testcase1,testcase2);
		System.out.println("Result : "+result);
	
	}

	public String newSubstring(String str, int beginIndex){
		
		char ch;
		int i=0;
		String s="";
		
		
		for(i=beginIndex;i<str.length();i++){
			ch=str.charAt(i);
			s=s+ch;
			
		}
		return s;
		
	}
}
