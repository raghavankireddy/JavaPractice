package third2b;

public class SwapLastChars {
	static String testcase1 = "123456";
	

	public static void main(String[] args) {
		SwapLastChars testInstance= new SwapLastChars();
		String result = testInstance.swap(testcase1);
		System.out.println(result);
	

	}

	public String swap(String str){
	
		
		int len,i;
		String s="";
		char ch;
		
		len=str.length();
		
		for(i=0;i<str.length();i++){
			
			if(i==(len-2)){
				ch=str.charAt(len-1);
				s=s+ch;
				ch=str.charAt(len-2);
				s=s+ch;
				break;
				
			}
			ch=str.charAt(i);
			s=s+ch;
			}	
		return s;
	}
}
