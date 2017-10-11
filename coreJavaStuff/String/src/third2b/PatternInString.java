package third2b;

public class PatternInString {
	static String testcase1 = "May i sit here";
	static String testcase2 = "here";
	
	static String testcase3 = "JavaLadders";
	static String testcase4 = "ers";

	public static void main(String[] args) {
		PatternInString testInstance= new PatternInString();
		boolean result = testInstance.occurs(testcase1,testcase2);
		System.out.println(result);
	
	}
	
	public boolean occurs(String str1, String str2){
		
		int i=0,value=0,flag=0;
		
		boolean b=false;
		
		for(i=0;i<str1.length()-str2.length()+1;i++){
			
			b=(str1.substring(i,i+str2.length())).equals(str2);
			
			if(b==true){
				flag=1;
				value=i;
				break;
			}	
		
			
		}
		System.out.println(value);
		
		
		if(flag==1)
			return true;
		else
			return false;
		
		
	}
}
