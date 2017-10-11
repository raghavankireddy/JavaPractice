package third2b;

public class JoinChars {
	static String testcase1 = "Right";
	static String testcase2 = "Wrong";

	public static void main(String[] args) {
		JoinChars testInstance= new JoinChars();
		String result = testInstance.join(testcase1,testcase2);
		System.out.println(result);

	}

	public String join(String str1, String str2){
		
		char ch1,ch2;
		int i=0;
		String s="";
		
		for(i=0;i<str1.length();i++){
			ch1=str1.charAt(i);
			ch2=str2.charAt(i);
			
			s=s+ch1+ch2;
			
		}
		return s; 
	}
}
