package third2b;

public class ReverseString {
	static String testcase1 = "emotionally";
	

	public static void main(String[] args) {
		ReverseString testInstance= new ReverseString();
		String result = testInstance.reverse(testcase1);
		System.out.println(result);

	}

	public String reverse(String str){
		
		char ch;
		int i=0;
		String s="";
		
		for(i=str.length()-1;i>=0;i--){
			ch=str.charAt(i);
			s=s+ch;
		}
		return s;
	}
}
