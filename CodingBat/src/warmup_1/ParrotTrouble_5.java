package warmup_1;
/*
 * We have a loud talking parrot. 
 * The "hour" parameter is the current hour time in the range 0..23. 
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
 * Return true if we are in trouble.

parrotTrouble(true, 6) : true
parrotTrouble(true, 7) : false
parrotTrouble(false, 6) : false
*/

public class ParrotTrouble_5 {
	
	static boolean testCase1=true;
	static int testCase2=6;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParrotTrouble_5 ob=new ParrotTrouble_5();
		boolean result=ob.parrotTrouble(testCase1, testCase2);
		System.out.println("Result Is -: " + result);
	}
	
	public boolean parrotTrouble(boolean talking, int hour) {
		if( (talking==true) && (hour<7 || hour>20) ){
			return true;
		}
		else{
			return false;
		}
	}

}
