package third2b;

public class ChangeStringCase {
	static String testcase1 = "May I sit here? Yes, you may.";
	
	public static void main(String[] args) {
		ChangeStringCase testInstance= new ChangeStringCase();
		String result = testInstance.changeCase(testcase1);
		System.out.println(result);

	}

	public String changeCase(String sentence){
		
		char ch;
		int i;
		String s="";
		
		for(i=0;i<sentence.length();i++){
			ch=sentence.charAt(i);
			
			if((ch>=65) && (ch<=90)){
				ch=(char)(ch+32);
				s=s+ch;
			}
			
			else if((ch>=97) && (ch<=122)){
				ch=(char)(ch-32);
				s=s+ch;
			}
			
			else{
				s=s+ch;
			}
				
			
		}
		return s;
	}
}
