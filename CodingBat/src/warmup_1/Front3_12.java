package warmup_1;
/*
 * Given a string, we'll say that the front is the first 3 chars of the string. 
 * If the string length is less than 3, the front is whatever is there. 
 * Return a new string which is 3 copies of the front.

front3("Java") : "JavJavJav"
front3("Chocolate") : "ChoChoCho"
front3("abc") : "abcabcabc"
 * */
public class Front3_12 {

	static String testcase1="Java";
	static String testcase2="a";
	static String testcase3="abcdabcdabcd";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Front3_12 ob=new Front3_12();
		String result=ob.front3(testcase3);
		System.out.println("Result Is -: "+result );
		
	}

	public String front3(String str) {
		  
		  if(str.equals("")){
		  return "";
		  }
		  
		  else if(str.length()==1){
		  return str+str+str;
		  }
		  
		  else if(str.length()<3){
		  String first2char=str.substring(0,2);
		  return (first2char+first2char+first2char);
		  
		  }
		  
		  else{
		  String first3Char=str.substring(0,3);
		  return (first3Char+first3Char+first3Char);
		  }
		}

}
