package second;

public class StringSubstring1 {
	static String testcase1 = "abcdefabcd";
	static int testcase2 = 4;
	static int testcase3 = 8;

	public static void main(String[] args) {
		StringSubstring1 testInstance = new StringSubstring1();
		String result = testInstance.newSubstring(testcase1,testcase2,testcase3);
		System.out.println("Result : "+result);

	}

	public String newSubstring(String str, int beginIndex, int endIndex){
		
		char ch;
		int i,len;
		len=endIndex-beginIndex;
		String s="";
		
		for(i=beginIndex;i<endIndex;i++){
			ch=str.charAt(i);
			s=s+ch;
		}
		return s;
		
	}
}
