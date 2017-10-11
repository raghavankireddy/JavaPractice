package fourth2b;

public class BinaryToDecimal {

	static String testcase1 = "11000000110110";
	static String testcase2 = "11111";
	static String testcase3 = "1000000";
	
	public static void main(String[] args) {
		BinaryToDecimal testInstance= new BinaryToDecimal();
		int result = testInstance.convert(testcase1);
		System.out.println("Result is : "+result);
	
	}

	public int convert(String binary){
	
		char ch;
		int i=0,pow=0,sum=0,len=0,val=0;
		len=binary.length();
		
		for(i=0;i<binary.length();i++){
			
			ch=binary.charAt(i);
			val=(int)(ch);
			val=val-48;
			System.out.println(val);
			pow=power(2,((len-1)-i));
			sum=sum+val*pow;	
			
		}
		
		
			return sum;	
	 }
		
		public int power(int num,int pow){
			
			int f=1;
			for(int i=0;i<pow;i++){
				f=f*num;
			}
			return f;
		}
		
		
}
	


