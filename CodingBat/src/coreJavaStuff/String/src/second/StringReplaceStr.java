package second;

public class StringReplaceStr {
	static String testcase1 = "abcdefacdebcdb";
	static String testcase2 = "cd";
	static String testcase3 = "xyz";
	

	public static void main(String[] args) {
		StringReplaceStr testInstance = new StringReplaceStr();
		String result = testInstance.newReplace(testcase1,testcase2,testcase3);
		System.out.println("Result : "+result);
	

	}

	public String newReplace(String str, String oldString, String newString){
		
		int i;
		char ch;
		String s="";
		
		for(i=0;i<str.length();i++){
			
			//j=i;
			
			ch=str.charAt(i);
			if(str.charAt(i)==oldString.charAt(i) && str.charAt(i+1)==oldString.charAt(i+1)){
				s=ch+newString;
				
			}

		
			
		}
			return s;
		
		
	}
}
