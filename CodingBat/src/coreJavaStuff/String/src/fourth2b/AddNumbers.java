package fourth2b;

public class AddNumbers {
	static String testcase1 = "2 233 34   7238 123 123 329 100";
	static String testcase2 = "12 24 36";
	

	public static void main(String[] args) {
		AddNumbers testInstance = new AddNumbers();
		int result = testInstance.addNumbers(testcase2);
		System.out.println("Result : "+result);
	
	}

	public int addNumbers(String str){
	
		int i=0,val=0,sum=0,val1=0;
		char ch,ch1;
		
		
		for(i=0;i<str.length();i++){
			ch=str.charAt(i);
			ch1=str.charAt(i+1);
			
			if(ch==32){
			}
			else{
				
			
				if(ch>=48 && ch<=57){
					val=(int)(ch);
					val1=(int)(ch1);
					val=val-48;
					val1=val1-48;
					sum=sum+val*10+;
				}
			}	
		}
		
		return sum;
	}
	
}
