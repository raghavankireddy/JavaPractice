package warmup_2;

/*
 * Given an array of ints, 
 * return true if one of the first 4 elements in the array is a 9. 
 * The array length may be less than 4.
 * 
 * 	arrayFront9([1, 2, 9, 3, 4]) : true
	arrayFront9([1, 2, 3, 4, 9]) : false
	arrayFront9([1, 2, 3, 4, 5]) : false

 */
public class ArrayFront9_9 {

	static int[]  testcase1={1,2,9,4,5};
	static int[]  testcase2={1,2,6,4,9};
	
	public static void main(String[] args) {
		
		ArrayFront9_9 ob =new ArrayFront9_9();
		
		boolean result = ob.arrayFront9(testcase2);
		System.out.println("Result Is : " + result);
	}

	
	public boolean arrayFront9(int[] nums) {
		
		boolean val = false;
		
		if(nums.length==0){
			return val;
		}
		else if(nums.length>=0){
			for (int i = 0; i < nums.length; i++) {
				if((nums[i]==9) && (i<4)){
					val = true;
					break;
				}
			}
		}
		else{
			return val;
		}
		
		return val;
	}

	
}
