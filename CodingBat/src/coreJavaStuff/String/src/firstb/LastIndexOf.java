
public class LastIndexOf {

	static String testcase1 = "abcdefbcd";
	static char testcase2 = 'b';
	
	public static void main(String[] args) {
		
		LastIndexOf testInstance = new LastIndexOf();
		int result = testInstance.newLastIndexOf(testcase1,testcase2);
		System.out.println("Result : "+result);
		
	}

	public int newLastIndexOf(String str1, char ch){
		
		char ch1;
		int i,flag=0,value=0;
		
		for(i=0;i<str1.length();i++){
			
			ch1=str1.charAt(i);
			if(ch1==ch){
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
