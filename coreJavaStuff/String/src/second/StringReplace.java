package second;

public class StringReplace {
	static String testcase1 = "abcdefacbdebb";
	static char testcase2 = 'c';
	static char testcase3 = 'x';

	public static void main(String[] args) {
		StringReplace testInstance = new StringReplace();
		String result = testInstance.newReplace(testcase1,testcase2,testcase3);
		System.out.println("Result : "+result);
	
	}

	public String newReplace(String str, char oldChar, char newChar){
	
		char ch;
		int i=0;
		String s="";
		
		for(i=0;i<str.length();i++){
		
			ch=str.charAt(i);
			
			if(ch==oldChar){
				ch=newChar;
			}
			s=s+ch;
					
		}
		return s;
	}
}
