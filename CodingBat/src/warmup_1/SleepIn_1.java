package warmup_1;

/*
 * The parameter weekday is true if it is a weekday, 
 * and the parameter vacation is true if we are on vacation. 
 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
*
sleepIn(false, false) : true
sleepIn(true, false) :false
sleepIn(false, true) : true
 * */

public class SleepIn_1 {
	
	static boolean testCase1=false;
	static boolean testCase2=true;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepIn_1 ob=new SleepIn_1();
		boolean result = ob.sleepIn(testCase1, testCase2);
		System.out.println("Result Is -: " + result);
	}
	
	public boolean sleepIn(boolean weekday,boolean vacation){
		
		if(!weekday || vacation){
			return true;
		}
		else{
			return false;
		}
	}
	

}
