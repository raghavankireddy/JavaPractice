package warmup_2;

/*
 * 
 * Count the number of "xx" in the given string. 
 * We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 * countXX("abcxx") : 1
 * countXX("xxx") : 2
 * countXX("xxxx") : 3
 */

public class CountXX_3 {

	static String testcase1="abcxxxxxx";
	static String testcase2="Hexxo thxxe";
	public static void main(String[] args) {
		
		CountXX_3 ob=new CountXX_3();
		
		int result = ob.countXX(testcase1);
		System.out.println("Result Is :" + result);


	}

	
	int countXX(String str) {
		  
		int count=0;
		
		char [] ch=str.toCharArray();
		
		for (int i = 0; i < ch.length-1; i++) {
			
			if(ch[i]==32){
				count=0;
			}
			if(ch[i]=='x'){
				count++;
			}	
		}
		
		return count;
	}

}
