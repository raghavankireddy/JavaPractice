package fourth2b;

public class GetMiddleWord {

	static String testcase1 = "sat";
	static String testcase2 = "sit";
	static String testcase3 = "soot";

	static String testcase4 = "going";
	static String testcase5 = "went";
	static String testcase6 = "go";

	
	public static void main(String[] args) {
		GetMiddleWord testInstance= new GetMiddleWord();
		String result = testInstance.middleWord(testcase4,testcase5,testcase6);
		System.out.println(result);
	
	}
	
	public String middleWord(String word1,String word2,String word3){
	
			int i=0,sum1=0,sum2=0,sum3=0;
			String s="";
			
		sum1=AsciiTotal(word1);
						
		System.out.println("Total Of First String :" +sum1);
		
		sum2=AsciiTotal(word2);
		
		System.out.println("Total Of First String :" +sum2);
		
		sum3=AsciiTotal(word3);
		
		System.out.println("Total Of First String :" +sum3);
		
		if((sum2>sum1 && sum2<sum3) || (sum2>sum3 && sum2<sum1))
			s=s+word2;
		if((sum1>sum2 && sum1<sum3) || (sum1>sum3 && sum1<sum2))
			s=s+word1;
		if((sum3>sum2 && sum3<sum2) || (sum3>sum1 && sum3<sum1))
			s=s+word3;
			
		return s;	
			
	}
	
	public int AsciiTotal(String str){
		
		int i,val1,sum=0;
		char ch1;

		for(i=0;i<str.length();i++){
			ch1=str.charAt(i);
			val1=(int)(ch1);
			sum=sum+val1;
		}

		return sum;
	}

}
