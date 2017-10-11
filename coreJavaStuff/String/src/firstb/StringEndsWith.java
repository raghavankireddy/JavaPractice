
public class StringEndsWith {
	static String testcase1 = "abcdef";
	static String testcase2 = "cdef";
	
	public static void main(String[] args) {
		StringEndsWith testInstance = new StringEndsWith();
		boolean result = testInstance.newEndsWith(testcase1,testcase2);
		System.out.println("Result : "+result);
	
	}
	
	public boolean newEndsWith(String str1, String suffix){
		
		char ch1,suffix1;
		int i=0,lensfx,flag=0,lenstr,diff=0;
		lensfx=suffix.length();
		lenstr=str1.length();
		diff=lenstr-lensfx;
		
			
		for(i=lensfx-1;i>=0;i--){
			//System.out.println(i);
			
			flag=0;
			ch1=str1.charAt(i+diff);
			suffix1=suffix.charAt(i);
			System.out.println(ch1 + "value - ch" + i);
			System.out.println(suffix1 + "value- suffix" + i);
			
			//System.out.println(i);
			
			if(ch1==suffix1){
				flag=1;
				
			}
				
		}
		
			if(flag==1)
				return true;
			else
				return false;
	
	}

}
