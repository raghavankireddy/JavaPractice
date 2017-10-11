package second;

public class StringIndexOfStr1 {
	
	static String testcase1 = "abcdefcdefcdefghcdefghcdecdE";
	static String testcase2 = "cde";
	static int testcase3 = 23;
	
	public static void main(String[] args) {
		
		StringIndexOfStr1 testInstance = new StringIndexOfStr1();
		int result = testInstance.newIndexOf(testcase1,testcase2,testcase3);
		System.out.println("Result : "+result);
		

	}
	
	public int newIndexOf(String str1, String str2, int fromIndex){
		
		char ch1,ch2;
		int flag=0,i=0,count=0,val=0;
		
		for(i=fromIndex;i<str1.length();i++){
			
		
			ch1=str1.charAt(i);
			ch2=str2.charAt(count);
			
				if(ch1==ch2){
					val=i;
					flag=1;
				}
				
				count++;
		}
			
		
		
		if(flag==1)
			return val;		
		else
			return -1;
		
		
	}

}
