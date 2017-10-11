


public class MaxDigit {

	static int testcase1 = 41239;
	
	public static void main(String[] args) {
		MaxDigit testInstance= new MaxDigit();
		int result = testInstance.maxNumber(testcase1);
		System.out.println(result);

	}

	public int maxNumber(int num){
		
	int max=0,rem=0;
			
			while(num!=0){
				rem=num%10;
				if(rem>max){
					max=rem;
				}
				num=num/10;
			}
	
	return max;
	

	}
}
