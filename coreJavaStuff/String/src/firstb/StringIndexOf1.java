
public class StringIndexOf1 {
	
	static String testcase1 = "abcdef";
	static char testcase2 = 'f';
	static int testcase3 = 2;
	
	public static void main(String[] args) {
		
		StringIndexOf1 testInstance = new StringIndexOf1();
		int result = testInstance.newIndexOf(testcase1,testcase2,testcase3);
		System.out.println("Result : "+result);
	

	}
	
	public int newIndexOf(String str1, char ch, int fromIndex){
	
		char ch1;
		int i,flag=0;
		
		for(i=fromIndex;i<str1.length();i++){
			ch1=str1.charAt(i);
		
			if((ch1==ch)){
				flag=1;
				break;
			}	
		
		}
		
		if(flag==1)
			return i;
		else
			return -1;
		
		}	
}
	
