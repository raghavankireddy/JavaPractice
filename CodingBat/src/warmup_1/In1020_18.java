package warmup_1;

/*
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) : true
in1020(21, 12) : true
in1020(8, 99) : false
 * */
public class In1020_18 {

	static int testcase1=10;
	static int testcase2=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		In1020_18 ob=new In1020_18();
		boolean result=ob.in1020(testcase1, testcase2);
		System.out.println("Result is :" + result);
	}

	public boolean in1020(int a, int b) {
		  if( (a>=10 && a<=20) || (b>=10 && b<=20) ){
		  return true;
		  }
		  else{
		  return false;
		  }
		   
		}
}
