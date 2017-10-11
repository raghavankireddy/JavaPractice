package third2b;

public class ConcatAsPattern {
	static String testcase1 = "site";
	static String testcase2 = "google";
	

	public static void main(String[] args) {
		ConcatAsPattern testInstance= new ConcatAsPattern();
		String result = testInstance.makePattern(testcase1,testcase2);
		System.out.println(result);
	
	}

	public String makePattern(String str1, String str2){
		
		int i=0,j=0;
		String pattern,s="";
		
		char chp,ch1,ch2;
		pattern=""+"()(/)";
		chp=pattern.charAt(0);
				
		//Here string is "("
		s=s+chp;
		
		for(i=0;i<str1.length();i++){
			ch1=str1.charAt(i);
			s=s+ch1;
		}
		s=s+")";
		
		//Here string is "(site)"
		
		for(i=0;i<str2.length();i++){
			ch2=str2.charAt(i);
			s=s+ch2;
		}
		
		s=s+"(/";
		
		chp=pattern.charAt(4);
		
		for(i=0;i<str1.length();i++){
			ch1=str1.charAt(i);
			s=s+ch1;
		}
		s=s+chp;
		
		
		return s;
	}
}
