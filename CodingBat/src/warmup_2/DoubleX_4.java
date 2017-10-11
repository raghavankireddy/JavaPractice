package warmup_2;


/*
 * Given a string, 
 * return true if the first instance of "x" in the string is immediately followed by another "x".
 * doubleX("axxbb") : true
 * doubleX("axaxax") : false
 * doubleX("xxxxx") : true 
 */

public class DoubleX_4 {

	static String testcase1="axaxxa";
	static String testcase2="axxxb";
	static String testcase3="xxxxxx";
	
	
	public static void main(String[] args) {

	DoubleX_4 ob= new DoubleX_4();
	boolean result = ob.doubleX(testcase3);
	System.out.println("Result Is :" + result);

		
	}

	boolean doubleX(String str) {

		char [] ch=str.toCharArray();
		
		boolean result=false;
		
		
		for (int i = 0; i< ch.length; i++) {
			if(ch[i]=='x'){
				if(ch[i+1]=='x'){
					result=true;
					break;
				}
				else{
					result=false;
					break;
				}
			}
			
			
			
			
		}
		
		return result;
	}

}
