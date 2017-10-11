package fifthlast;

public class IntToBin {


	static int testcase1 = 1023;
	
	public static void main(String[] args) {
		IntToBin testInstance= new IntToBin();
		String result = testInstance.convert(testcase1);
		System.out.println("Result is : "+result);
	
	}
	
	public String convert(int num){
		
		int rem=0,sum=0,i=1;
		String s="";
		
		while(num!=0){
			rem=num%2;
			sum=rem*i+sum;
			i=i*10;
			num=num/2;
		}
		
		s=s+sum;
		//System.out.println(sum);
		return s;
	}

	
}

