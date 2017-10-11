package warmup_1;
/*
 * Given three int values, a b c, return the largest.

intMax(1, 2, 3) : 3
intMax(1, 3, 2) : 3
intMax(3, 2, 1) : 3
 */

public class IntMax_24 {

	static int testcase1=1;
	static int testcase2=2;
	static int testcase3=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntMax_24 ob=new IntMax_24();
		int result=ob.intMax(testcase1, testcase2, testcase3);
		System.out.println("Result Is : "+result);
	}
	
	public int intMax(int a, int b, int c) {
		  
		  if( a>b && a>c){
		  return a;
		  }
		  
		  else if( b>a && b>c){
		  return b;
		  }
		  
		  else{
		  return c;
		  }
		}

}
