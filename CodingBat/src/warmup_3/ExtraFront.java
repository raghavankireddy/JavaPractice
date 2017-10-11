package warmup_3;

public class ExtraFront {

	public static String testcase1 = "Hello";
	public static String testcase2 = "ab";

	public static void main(String[] args) {
		
		ExtraFront ob = new ExtraFront();
		
		String result = ob.extraFront(testcase1);
		System.out.println("Result Is " + result);

	}

	public String extraFront(String str) {
		
		String str1="";
		if(str.length()>1){
			for (int i = 0; i <3; i++) {
				str =str.substring(0,2); 
				str1+=str;
			}
		}
		
		else
		{
			for (int i = 0; i <3; i++) {
				str =str.substring(0,str.length()); 
				str1+=str;
			}
		}
		
		return str1;

	}

}
