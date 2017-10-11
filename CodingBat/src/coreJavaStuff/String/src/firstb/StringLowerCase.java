
public class StringLowerCase {
	static String testcase1 = "ABCDEF";
	static String testcase2 = "12";
	
	public static void main(String[] args) {
	
		StringLowerCase testInstance = new StringLowerCase();
		String result = testInstance.newToLowerCase(testcase2);
		System.out.println("Result : "+result);
	

	}
	
	public String newToLowerCase(String str){
	
		char ch;
		String s="";
		
			for(int i=0;i<str.length();i++){
				ch=str.charAt(i);
				if(ch>=65 && ch<=90)
					ch=(char)(ch+32);
				
				s=s+ch;
			}
			
			return s;	
		}
}


