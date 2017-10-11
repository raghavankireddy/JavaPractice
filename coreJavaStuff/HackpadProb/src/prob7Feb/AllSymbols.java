package prob7Feb;

public class AllSymbols {
	
	static String testcase1 ="aC+10z2,*Abd3=m41?";
	static String testcase2 = "aFGDFe536!@#96rewsns?,=12asdf";

	public static void main(String[] args) {
		AllSymbols testcase =new AllSymbols();
		String result = testcase.orderingCharacters(testcase1);
		System.out.println("Result is:"+result);
	

	}

	public String orderingCharacters(String str){
		
		String s="";
		int i=0;
		char ch;
		
		// For Alphabets
		for(i=0;i<str.length();i++){
			ch=str.charAt(i);
			
			if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)){
				s=s+ch;
			}
		}
		
		// For Numbers 
		for(i=0;i<str.length();i++){
			ch=str.charAt(i);
			
			if(ch>=48 && ch<=57){
				s=s+ch;
			}
		}
		
		// For Symbols
		for(i=0;i<str.length();i++){
			ch=str.charAt(i);
			
			if((ch>=32 && ch<=47) || (ch>=58 && ch<=64)){
				s=s+ch;
			}
		}
		
		return s;
	}
	
}
