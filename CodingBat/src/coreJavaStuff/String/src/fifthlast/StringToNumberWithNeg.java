package fifthlast;

public class StringToNumberWithNeg {

	static String testcase1 = "-12001";
	
	public static void main(String[] args) {
		StringToNumberWithNeg testInstance= new StringToNumberWithNeg();
		int result = testInstance.toNumber(testcase1);
		System.out.println("Result is:"+result);
	
	}
	
	public int toNumber(String str){
		
		int i=0,val=0,sum=0,flag=0;
		char ch;
		
		for(i=0;i<str.length();i++){
			
			ch=str.charAt(i);
			
			if(ch==45){
				flag=1;
			}
			else{
				ch=str.charAt(i);
				val=(int)(ch);
				val=val-48;
				sum=sum*10+val;
			}
			
		}
		
		if(flag==1)
			return (sum*-1);
		else
			return sum;

	}

}
