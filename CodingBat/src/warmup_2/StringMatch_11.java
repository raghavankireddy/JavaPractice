package warmup_2;

/*
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

	stringMatch("xxcaazz", "xxbaaz") : 3
	stringMatch("abc", "abc") : 2
	stringMatch("abc", "axc") : 0
 */
public class StringMatch_11 {

	static String testcase1="xxcaazz";
	static String testcase2="xxbaaz";
	
	static String testcase3="he";
	static String testcase4="hello";
	
	
	public static void main(String[] args) {

		StringMatch_11 ob =new StringMatch_11();
		
		int result = ob.stringMatch(testcase3, testcase4);
		
		System.out.println("Result Is : " + result);
		
	}
	
	public int stringMatch(String a, String b) {
		  
		int count=0;
		
		int range1,range2;

		String char1="",char2="";
		
		range1=a.length();
		range2=b.length();
		
		int range;
		
		if(range1>range2){
			range=range1;
		}
		else{
			range=range2;
		}
		
		if( (a.length()<1) && (b.length()<1) ){
			return 0;
		}

		
		else{
		
			for (int i = 0,j=0; (i < range1-1) && (j < range2-1) ; i++,j++) {
				char1 = a.substring(i, i+2);
				char2 = b.substring(j, j+2);
				System.out.println("Val1 : "+char1);

				System.out.println("Val2 :  "+char2);
				

				if(char1.equals(char2)){
					count++;
				}
			}
			
			
		}
		
		
		return count;
	}


}
