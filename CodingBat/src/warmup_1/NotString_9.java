package warmup_1;

/*
 * Given a string, return a new string where "not " has been added to the front. 
 * However, if the string already begins with "not", return the string unchanged. 
 * Note: use .equals() to compare 2 strings.

notString("candy") : "not candy"
notString("x") : "not x"
notString("not bad") : "not bad"
*/

public class NotString_9 {

	static String testcase1="candy";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotString_9 ob=new NotString_9();
		String result = ob.notString(testcase1);
		System.out.println("Result Is -: "+result);
		
	}

	public String notString(String str) {
		if ( str.length()>=3 && str.substring(0, 3).equals("not") ){
			return str;
		}
		else{
			return "not"+str;
		}
	}
}
