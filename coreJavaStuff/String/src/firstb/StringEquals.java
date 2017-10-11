
public class StringEquals {

	static String testcase1 = "abcDef";
	static String testcase2 = "abcdef";
	
	
	public static void main(String[] args) {
		
		StringEquals testInstance = new StringEquals();
		boolean result = testInstance.newEquals(testcase1,testcase2);
		System.out.println("Result : "+result);
	

	}
	
	public boolean newEquals(String str1, String str2){
	
		char ch1,ch2;
		int flag=0;
		int len1=str1.length();
		int len2=str2.length();
		
		if(len1==len2){
			
			for(int i=0;i<str1.length(); i++){
				flag=0;
				ch1=str1.charAt(i);
				ch2=str2.charAt(i);
				
				if(ch1==ch2)
					flag=1;
				else
					break;
			}
		
		}
		
		if(flag==1)
			return true;
		else
			return false;
		
	}

}
