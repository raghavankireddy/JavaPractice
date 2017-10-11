package prob7Feb;



public class LargeNumber {
	static String testcase1 = "999124578963548791245656568";
	static String testcase2 = "999999999999845236972362586";
	
	static String testcase3 = "12546598532299939124578963548791245656568";
	static String testcase4 = "23659749512695999999999999845236972362586";
	
	static String testcase5 = "121";
	static String testcase6 = "112";
	
	

	public static void main(String[] args) {
		LargeNumber testInstance= new LargeNumber();
		String result = testInstance.computeLarger(testcase5,testcase6);
		System.out.println("Result is:"+result);
	
	}
	
	public String computeLarger(String num1, String num2){
		
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
		sum=sum+val1;
		
	}
	
	return sum;
}

}
