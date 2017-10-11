package warmup_2;

/*
 * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
 *
	array123([1, 1, 2, 3, 1]) : true
	array123([1, 1, 2, 4, 1]) : false
	array123([1, 1, 2, 1, 2, 3]) : true
 */
public class Array123_10 {

	static int [] testcase1 = {1,2,3,4,5,6};
	static int [] testcase2 = {1,5,9,4,2,5};
	
	public static void main(String[] args) {

		Array123_10 ob =new Array123_10();
		
		boolean result = ob.array123(testcase1);
		System.out.println("Result Is : " + result);
		
		
	}

	public boolean array123(int[] nums) {
		
		boolean val = false;
		
		if(nums.length<1){
			return val;
		}
		else if(nums.length>0){
			for (int i = 0; i < nums.length-2; i++) {
				if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
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

