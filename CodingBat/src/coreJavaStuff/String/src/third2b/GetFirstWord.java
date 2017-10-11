package third2b;

public class GetFirstWord {


	static String testcase1 = "May i sit here?";
	
	public static void main(String[] args) {
		GetFirstWord testInstance= new GetFirstWord();
		String result = testInstance.firstWord(testcase1);
		System.out.println(result);
	

	}
	public String firstWord(String sentence){
		
		char ch;
		int i;
		String s="";
		
		for(i=0;i<sentence.length();i++){
			
			ch=sentence.charAt(i);
			
			s=s+ch;
			if(ch==32){
				break;
			}
		}
		return s;
		
	}

	
}
