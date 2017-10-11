package warmup_2;
/*
 *Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") : "Hlo"
stringBits("Hi") : "H"
stringBits("Heeololeo") : "Hello"

*/
public class StringBits_5 {


	static String testcase1="Hello";
	static String testcase2="Heeololeo";
	
	public static void main(String[] args) {
		
		StringBits_5 ob = new StringBits_5();
		
		String result = ob.stringBits(testcase2);
		System.out.println("Result Is :" + result);

	}
	
	public String stringBits(String str) {
		  String result="";
		  
		  for(int i=0;i<str.length();i=i+2){
		    result = result + str.substring(i,i+1);
		  }
		  return result;
		}

}
