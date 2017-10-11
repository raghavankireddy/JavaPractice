package fourth2b;

public class MoveUppercaseChars {

	static String testcase1 = "Can you reverse this String It is a great sentence Do you like IT";
	static String testcase2 = "Hello World";
	static String testcase3 = "India";
	
	public static void main(String[] args) {
		MoveUppercaseChars testInstance = new MoveUppercaseChars();
		String result = testInstance.move(testcase3);
		System.out.println("Result : "+result);
		

	}
	
	public String move(String str){
	
		String s="",s1="",s2="";
		int i=0;
		
		char ch;
		
		for(i=0;i<str.length();i++){
			
			ch=str.charAt(i);
			
			if(ch>=65 && ch<=90){
				s1=s1+ch;
			}
			
			else{
				s2=s2+str.charAt(i);
			}
			
			s=s2+s1;
		}
		
		
		return s;
		
	}

}
