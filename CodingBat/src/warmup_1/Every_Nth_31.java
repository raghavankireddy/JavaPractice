package warmup_1;
/*
 * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
 * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) : "Mrce"
everyNth("abcdefg", 2) : "aceg"
everyNth("abcdefg", 3) : "adg"
 * */
public class Every_Nth_31 {

	static String testcase1="Benjamin";
	static int testcase2=2;
	
	public static void main(String[] args) {
		
		Every_Nth_31 ob=new Every_Nth_31();
		String result=ob.everyNth(testcase1, testcase2);
		System.out.println("Result Is: "+result);
	}

	public String everyNth(String str, int n) {
	
	String stra="";
	
	if(str.equals("")){
	return str;
	}
	
	else{
		for(int i=0;i<str.length();i=i+n){
	      stra=stra+str.charAt(i);
	    }  
	  return stra;
	  }
	
	
 }
	

}
