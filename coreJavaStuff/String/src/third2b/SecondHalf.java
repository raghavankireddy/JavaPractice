package third2b;

public class SecondHalf {

	static String testcase1 = "HelloWorld";
	
	public static void main(String[] args) {
		SecondHalf testInstance= new SecondHalf();
		String result = testInstance.half(testcase1);
		System.out.println(result);
	

	}

	public String half(String word){
		
		int len=0,i;
		len=word.length();
		char ch;
		String s="";
		
		for(i=len/2;i<len;i++){
			ch=word.charAt(i);
			s=s+ch;
		}
		return s;
			
	}
}
