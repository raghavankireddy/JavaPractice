package third2b;

public class MiddleOneThird {

	static String testcase1 = "HowDoYouDo";
	static String testcase2 = "HelloMother";
	static String testcase3 = "Animal";


	public static void main(String[] args) {
		MiddleOneThird testInstance= new MiddleOneThird();
		String result = testInstance.oneThird(testcase3);
		System.out.println(result);
	
	}
	public String oneThird(String word){
	
		int len=0,countfactor=0,mod=0,count=0,i=0;
		len=word.length();
		mod=len%3;
		String s,s1;
		
		s="";
		s1="";
		
		// Values Like 9,12,15
		if(mod==0){
			s=s+word;	
		}
		
		// Values Like 10,13,16
		if(mod==1){
			s=" "+ word + " ";
		}
	
		// Values Like 11,14,17
		if(mod==2){
			s=""+word.substring(1, len-1);
		}
		
		
		countfactor=s.length()/3;
		
				
		for(i=0;i<s.length();i=i+countfactor){
			count++;
			s1=s.substring(i,i+countfactor);
			if(count==2){
				break;
			}
		}
		
		return s1;
	}

}
