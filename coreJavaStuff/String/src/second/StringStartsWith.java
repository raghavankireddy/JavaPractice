package second;

public class StringStartsWith {
	static String testcase1 = "abcdef";
	static String testcase2 = "abcd";
	
	public static void main(String[] args) {
		StringStartsWith testInstance = new StringStartsWith();
		boolean result = testInstance.newStartsWith(testcase1,testcase2);
		System.out.println("Result : "+result);
	}

	public boolean newStartsWith(String str1, String prefix){
	
		char ch1,ch2;
		int i=0,len2=0,flag=0;
		

		len2=prefix.length();
		
		for(i=0;i<len2;i++){
			flag=0;
			ch1=str1.charAt(i);
			ch2=prefix.charAt(i);
			
			if(ch1==ch2){
				flag=1;
			}
		}
		
		if(flag==1)
			return true;
		else
			return false;
		
		
		
	}
}
