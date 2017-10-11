package warmup_1;
/*
 * Given a string, return a new string where the last 3 chars are now in upper case. 
 * If the string has less than 3 chars, uppercase whatever is there. 
 * Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello"): "HeLLO"
endUp("hi there") : "hi thERE"
endUp("hi") : "HI"
 * */

public class EndUp_30 {

	static String testcase1="hello chirkut";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EndUp_30 ob=new EndUp_30();
		String result=ob.endUp(testcase1);
		System.out.println("Result Is :"+result);
	}

	public String endUp(String str) {
		  		  
		  if( (str.length()<=3) ) {
		  return str.toUpperCase();
		  }
		  else{
		  int cut=str.length()-3;
		  
		  String front=str.substring(0,cut);
		  String back=str.substring(cut);
		  
		    return front+back.toUpperCase();
		  }
		   
		}

}
