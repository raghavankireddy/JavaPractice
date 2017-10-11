package warmup_2;
/*
*Given a string and a non-negative int n, 
*return a larger string that is n copies of the original string.

stringTimes("Hi", 2) : "HiHi"
stringTimes("Hi", 3) : "HiHiHi"
stringTimes("Hi", 1) : "Hi"
*/
public class StringTimes_1 {

static String testcase1="Oh Boy!";
static int testcase2=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTimes_1 ob=new StringTimes_1();
		String result=ob.stringTimes(testcase1, testcase2);

		System.out.println("Result Is :" + result);
				
	}

	public String stringTimes(String str, int n) {
		  
		String str1="";
		
		for(int i=1;i<=n;i++){
		  str1=str1+str;
		  }
		  return str1;
		}

}
