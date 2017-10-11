package warmup_1;
/*
 * Given a string, take the last char and return a new string with the last char added at the front 
 * and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") : "tcatt"
backAround("Hello") : "oHelloo"
backAround("a") : "aaa"
 * */
public class BackAround_13 {
static String testcase1="caty";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BackAround_13 ob=new BackAround_13();
		String result=ob.backAround(testcase1);
		System.out.println("Result Is -: "+result);
	}

	public String backAround(String str) {
		  int n=str.length();
		  String lastchar=str.substring(n-1,n);
		  return (lastchar+str+lastchar);
		}

}
