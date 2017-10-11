
public class FirstIndexOf {
	static String testcase1 = "abcdef";
	static char testcase2 = 'c';
	
	public static void main(String[] args) {
		FirstIndexOf testInstance = new FirstIndexOf();
		int result = testInstance.newIndexOf(testcase1,testcase2);
		System.out.println("Result : "+result);
		
	}
	
	public int newIndexOf(String str1, char ch){
	
		char ch1;
		int i,flag=0;
		
		for(i=0;i<str1.length();i++){
		
		ch1=str1.charAt(i);
		
		if(ch1==ch){
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
