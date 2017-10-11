package warmup_1;
/*
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 * Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) : true
loneTeen(21, 19) : true
loneTeen(13, 13) : false
 * */

public class LoneTeen_20 {

	static int testcase1=13;
	static int testcase2=13;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoneTeen_20 ob=new LoneTeen_20();
boolean result=ob.loneTeen(testcase1, testcase2);

System.out.println("Result Is : "+result );
	}


public boolean loneTeen(int a, int b) {
		  if( (a>=13 && a<=19) && (b>=13 && b<=19)  )
				 {
				 return false;
				 }
		else if ( (a>=13 && a<=19) || (b>=13 && b<=19)  )
		                 {
				 return true;
				 }

		else     {
				 return false;
				 }
		}

}
