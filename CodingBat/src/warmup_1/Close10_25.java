package warmup_1;

/*
 * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
 * Note that Math.abs(n) returns the absolute value of a number.
close10(8, 13) : 8
close10(13, 8) : 8
close10(13, 7) : 0
*/
public class Close10_25 {

	static int testcase1=8;
	static int testcase2=9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Close10_25 ob=new Close10_25();
		int result=ob.close10(testcase1, testcase2);
		System.out.println("Result Is : " + result);
		
	}

	public int close10(int a, int b) {
		 
		 int aDiff=Math.abs(a-10);
		 int bDiff=Math.abs(b-10);
		 
		 if(aDiff < bDiff){
		 return a;
		 }
		 
		 else if(bDiff < aDiff){
		 return b;
		 } 
		 
		 else{
		 return (aDiff-bDiff);
		 }
		  
		}

}
