package warmup_1;

/*
 * We have two monkeys, a and b, 
 * and the parameters aSmile and bSmile indicate if each is smiling. 
 * We are in trouble if they are both smiling or if neither of them is smiling. 
 * Return true if we are in trouble.
 * 
monkeyTrouble(true, true) : true
monkeyTrouble(false, false) : true
monkeyTrouble(true, false) : false
*
* 
*/
public class MonkeyTrouble_2 {

	static boolean testCase1=false;
	static boolean testCase2=false;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MonkeyTrouble_2 ob=new MonkeyTrouble_2();
		boolean result = ob.monkeyTrouble(testCase1, testCase2);
		System.out.println("Result Is -: "+result);
		
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	
		if( (!aSmile && !bSmile)  || (aSmile && bSmile) ){
			return true;
		}
		else{
			return false;
		}
	}
}
