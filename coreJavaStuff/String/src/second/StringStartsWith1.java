package second;

public class StringStartsWith1 {
	static String testcase1 = "abcdef";
	static String testcase2 = "cdef";
	static int testcase3 = 2;
	

	public static void main(String[] args) {
		StringStartsWith1 testInstance = new StringStartsWith1();
		boolean result = testInstance.newStartsWith(testcase1,testcase2,testcase3);
		System.out.println("Result : "+result);
	

	}
	
	public boolean newStartsWith(String str1, String prefix,int offset){
		
		int i,flag=0;
		char ch1,ch2;

		ch2=prefix.charAt(0);
		
		for(i=0;i<str1.length();i++){
			flag=0;
			ch1=str1.charAt(i);
			
			
			if((offset==i) && (ch2==ch1) ){
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			return true;
		else
			return false;
		
		
	}

}
