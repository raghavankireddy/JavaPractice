package third2b;

public class CombineOuterString {
	static String testcase1 = "<<<>>>";
	static String testcase2 = "Naresh Sharma";
	
	
	public static void main(String[] args) {
		CombineOuterString testInstance= new CombineOuterString();
		String result = testInstance.combine(testcase1,testcase2);
		System.out.println(result);
	

	}

	public String combine(String str1, String str2){
	
		String s="";
		int i,j,len=str1.length();
		char ch,ch1;
		
	
		for(i=0;i<len;i++){
			
			ch=str1.charAt(i);
			s=s+ch;		
			
			if(i==(len/2)-1){
				for(j=0;j<str2.length();j++){
					ch1=str2.charAt(j);
					s=s+ch1;
				}
			}
			
		}
		return s;
		
	}
}
