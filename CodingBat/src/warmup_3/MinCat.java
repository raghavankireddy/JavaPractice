package warmup_3;

public class MinCat {

	public static String testcase1 = "java";
	public static String testcase2 = "Hello";
	
	public static void main(String[] args) {

		MinCat ob = new MinCat();
		String res = ob.minCat(testcase1, testcase2);
		System.out.println(res);
	}

	public String minCat(String a, String b) {

		int len1 = a.length();
		int len2 = b.length();
		
		System.out.println("One: " + len1);
		System.out.println("Two: " + len2);
		
		
		int finlen=0;
		
		
		
		if(len1>0 && len2>0){
		
			if(len1>len2){
				finlen=len2;
				return a.substring(len1-finlen,len1)+b;
			}
			
			else if(len2>len1){
				finlen=len1;
				return a+b.substring(len2-finlen,len2);
			}
			
			else{
				finlen=len1;
			}
			
		}
		return "";
	}

}
