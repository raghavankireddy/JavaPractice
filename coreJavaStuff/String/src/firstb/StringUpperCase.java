
public class StringUpperCase {
	
	static String testcase1 = "abcdef";
	static String testcase2 = "Ab12";
	
	public static void main(String[] args) {
	
		StringUpperCase testInstance = new StringUpperCase();
		String result = testInstance.newToUpperCase(testcase1);
		System.out.println("Result : "+result);
	

	}

	public String newToUpperCase(String str){
		char ch;
		String s="";
		
			for(int i=0;i<str.length();i++){
				ch=str.charAt(i);
				if(ch>=97 && ch<=122)
					ch=(char)(ch-32);
				
				s=s+ch;
			}
			
			return s;
	}
}
