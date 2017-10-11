package second;

public class StringLastIndexOfStr {
	static String testcase1 = "hello world. hello world.";
	static String testcase2 = "world";
	
	static String testcase3 = "abcdeabcdeabcdeabcdeabcde";
	static String testcase4 = "cde";
	

	public static void main(String[] args) {
		StringLastIndexOfStr testInstance = new StringLastIndexOfStr();
		int result = testInstance.newLastIndexOf(testcase3,testcase4);
		System.out.println("Result : "+result);
	

	}

	public int newLastIndexOf(String str1, String str2){
		
		char ch1,ch2;
		int i,flag=0,value=0,len=0;
		
		ch2=str2.charAt(0);
	
		for(i=0;i<str1.length();i++){
	
			ch1=str1.charAt(i);
			if(ch1==ch2){
				flag=1;
				value=i;
				
			}	
		}
		
		if(flag==1)
			return value;
		else
			return -1;
		
	}

}
