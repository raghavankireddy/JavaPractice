package prob7Feb;

public class InstanceChar {
	
	static String testcase1 ="speed";
	static String testcase2 ="ab000c";
	static String testcase3 ="ab0000c";
	

	public static void main(String[] args) {
		InstanceChar testcase =new InstanceChar();
		String result = testcase.instanceOfAChar(testcase3);
		System.out.println("Result is:"+result);
	

	}

	public String instanceOfAChar(String str){

		char ch,ch1;
		int i;
		String s="";
		
		for(i=0;i<str.length()-1;i++){
			ch=str.charAt(i);
			ch1=str.charAt(i+1);
			
			if(ch==ch1){
				i++;
				s=s+"@#"+ch+"@#";
			}
			else{
				s=s+ch;
			}

		}
		s=s+str.charAt(i);
		
	
		return s;
	}
}
