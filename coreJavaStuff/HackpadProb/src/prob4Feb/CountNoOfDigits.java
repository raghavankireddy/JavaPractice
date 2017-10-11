package prob4Feb;

public class CountNoOfDigits {
	
	static String testcase1 = "0123450";
	

	public static void main(String[] args) {
		CountNoOfDigits testInstance= new CountNoOfDigits();
		String result = testInstance.checkCount(testcase1);
		System.out.println("Result is:"+result);
	

	}
	
	


public String checkCount(String str){
	
	int i=0,count=0;
	char ch;
	String s="";
	
	for(i=0;i<str.length();i++){
		ch=str.charAt(i);
		
		if(ch>=48 && ch<=57){
			count++;
		}
	}
	
	System.out.println(count);
	
	s=s+count;
	return s;
	
}


}