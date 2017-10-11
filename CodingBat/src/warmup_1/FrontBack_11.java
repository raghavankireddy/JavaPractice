package warmup_1;

/* 
* Given a string, return a new string where the first and last chars have been exchanged.
* 
* frontBack("code") "eodc"
* frontBack("a") "a"
* frontBack("ab")  "ba"
 * */

public class FrontBack_11 {

	static String testCase1="CODE";
	
	public static void main(String[] args) {
	
	FrontBack_11 ob=new FrontBack_11();
	
	String strOutput=ob.frontBack(testCase1);
	System.out.println(strOutput);
	
	}
	
	public String frontBack(String str){
		
		if( str.equals("") ){
			return "";
		}
		
		else if(str.length()==1){
			return str;
		}
		else{
			String first=str.substring(0,1);
			String last=str.substring(str.length()-1, str.length());
			String finalString=last+str.substring(1, str.length()-1)+first;
			return finalString;
		}
		
	}

}
