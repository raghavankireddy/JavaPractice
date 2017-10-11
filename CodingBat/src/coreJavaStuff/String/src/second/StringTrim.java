package second;

public class StringTrim {
	static String testcase1 = " a b c d e f g ";
	static String testcase2 = "abcdef";
	
	public static void main(String[] args) {
		StringTrim testInstance = new StringTrim();
		String result = testInstance.newTrim(testcase1);
		System.out.println("Result:"+result + "hi");
	

	}
	
	public String newTrim(String str){
	
		int j=0,i=0,flag=0;
		char ch;
		String s="";
		
		
		
		System.out.println("Length of String =" + str.length());

			for(i=0;i<str.length()-1;i++){
				
				ch=str.charAt(i);
				
				if(ch==32 && (str.length()-1==32)){
					continue;
				}
				else{
					ch=str.charAt(i+1);
					s=s+ch;
				}
			}
			

			System.out.println("Value of i =" + i);
			System.out.println(str.charAt(13));
		
		System.out.println("Now the length is " +s.length());
		
		System.out.println("Last Value" + s.charAt(13) + "present");
		
		System.out.println("Ac Srtring:" +s);
		
		String s1="";
		char ch1;
		
		for(i=s.length();i>=0;i--){
			ch1=s.charAt(i);
			
			if(ch1==32){
				continue;
			}
			else{
				ch1=s1.charAt(i+1);
				s1=s1+ch1;
			}
		}
		
		System.out.println("Reversed String "+s1);
		return s;
	}
}
