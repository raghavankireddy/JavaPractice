package warmup_1;

/*
 * Given a string, return a string made of the first 2 chars (if present), 
 * however include first char only if it is 'o' 
 * and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") : "oz"
startOz("bzoo") : "z"
startOz("oxx") : "o"
 * */
public class Startoz_23 {

	static String testcase1="ozooe";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Startoz_23 ob=new Startoz_23();
		String result=ob.startOz(testcase1);
		System.out.println("Result Is : "+result);
	}

	public String startOz(String str) {
		  
		if( str.equals("") ){
		  return "";
		}  
		  
		else if( str.length()>=2 && str.substring(0,1).equals("o") && str.substring(1,2).equals("z") ){
		  return "oz";
		}
		  
		else if( str.length()>=2 && str.substring(0,1).equals("o") ) {
		  return "o";  
		}
		  
		else if( str.length()>=2 && str.substring(1,2).equals("z") ) {
		  return "z";  
		}
		    
		else if( str.length()>=2 || str.substring(0,1).equals("!o") &&   str.substring(1,2).equals("!z") ){
			return "";
		}
		 
		else{
		    return str;
		}
		  
}

	
}
