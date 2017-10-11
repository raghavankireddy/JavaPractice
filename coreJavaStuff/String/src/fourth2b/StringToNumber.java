package fourth2b;

public class StringToNumber {


	static String testcase1 = "895625";
	
	public static void main(String[] args) {
		StringToNumber testInstance= new StringToNumber();
		int result = testInstance.toNumber(testcase1);
		System.out.println("Result is : "+result);
	

	}
	public int toNumber(String str){
	
		int i=0,val=0,number=0,sum=0;
		char ch;
		
		for(i=0;i<str.length();i++){
			
			ch=str.charAt(i);
			val=(int)(ch);
			val=val-48;
			sum=sum*10+val;
		}
		
		
		return sum;
	}

	
}
