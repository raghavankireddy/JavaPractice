package fourth2b;

public class LargerNumber {

	static String testcase1 = "2354725234782357";
	static String testcase2 = "2354725234782347";
	
	static String testcase3 = "123";
	static String testcase4 = "2345";
	
	
	
	public static void main(String[] args) {
	
		LargerNumber testInstance = new LargerNumber();
		String result = testInstance.larger(testcase1,testcase2);
		System.out.println("Result : "+result);
	

	}
	
	public String larger(String num1, String num2){
	
			int val1,val2;
			String s="";
			
			val1=ComputeSum(num1);
			val2=ComputeSum(num2);
			
			System.out.println("First Value" +val1);
			
			System.out.println("Second Value" +val2);
			
			if(val1>val2)
				s=s+num1;
			else
				s=s+num2;
			
			
			return s;
	}

	public int ComputeSum(String str){
		
		int i,sum=0,val1=0;
		
		char ch;
		
		for(i=0;i<str.length();i++){
			ch=str.charAt(i);
			val1=(int)(ch);
			//System.out.println(val1);
			sum=sum+val1;
			//System.out.println(sum);
			
		}
		
		return sum;
	}
}
