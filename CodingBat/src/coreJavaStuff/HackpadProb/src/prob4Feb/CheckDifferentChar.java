package prob4Feb;

public class CheckDifferentChar {
	static String testcase1 = "hello";
	//static char testcase2 = 's';
	

	public static void main(String[] args) {
		CheckDifferentChar testInstance= new CheckDifferentChar();
		int result = testInstance.checkCountDiff(testcase1);
		System.out.println("Result is:"+result);
	

	}

public int checkCountDiff(String str1){
		
		int i=0,index=0,count=0;
		char ch;
		String str2="";
	
		
		for(i=0;i<str1.length();i++){
			
			ch=str1.charAt(i);
			index=str2.indexOf(ch);
			System.out.println(index);
			
			if(index==-1){
				str2=str2+ch;
				count++;
			}
			
		}		
		return count;
		
	}


}
