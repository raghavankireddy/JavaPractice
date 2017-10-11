package third2b;

public class CountCharInString {
	static String testcase1 = "May i sit here?";
	static char testcase2 = 'i';

	public static void main(String[] args) {
		CountCharInString testInstance= new CountCharInString();
		int result = testInstance.count(testcase1,testcase2);
		System.out.println(result);
	
	}

	public int count(String word, char ch){
		int count=0,i;
		char ch1;
		
		for(i=0;i<word.length();i++){
			ch1=word.charAt(i);
			
			if(ch1==ch){
				count++;
			}
		}
		
		return count;
				
		
	}
}
