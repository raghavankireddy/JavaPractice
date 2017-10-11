package prob4Feb;

public class Function {
	static int testcase1 = 1;
	static int testcase2 = 5;
	

	public static void main(String[] args) {
		Function testInstance= new Function();
		int result = testInstance.computeFunction(testcase1,testcase2);
		System.out.println("Result is:"+result);
	
	}
	
	
	public int computeFunction(int num1,int num2){
		
		int i,value=0,sum=0;
		
		for(i=num1;i<=num2;i++){
			
			if( (i%7==0)){
				sum=sum+2*i+1;				
			}
			
			else if((i%3==0)){
				sum=sum+5*i+3;
			}
		
			else if( ((8*i+7)%3==0) && ((8*i+7)%7==0) ) {
				sum=sum+8*i+7;
			}
			
			else{
				value=(3*i)+2;
				sum=sum + value;
				
			}
		}
		
		return sum;
	}

}
