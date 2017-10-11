package warmup_2;

/*
 * Given an array of ints, return the number of 9's in the array.

	arrayCount9([1, 2, 9]) : 1
	arrayCount9([1, 9, 9]) : 2
	arrayCount9([1, 9, 9, 3, 9]) : 3
 * */
public class ArrayCount9_8 {

	static int[] testcase1={1,2,9,9};
	static int[] testcase2={1,5,6};
	
	
	public static void main(String[] args) {

		ArrayCount9_8 ob =new ArrayCount9_8();
		
		
		int result = ob.arrayCount9(testcase1);
		System.out.println("Result Is : " + result);
	}
	
	public int arrayCount9(int[] nums) {
		  
		  int count=0;
		  
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==9){
		      count++;
		    }
		  }
		  
		  return count;
		}

	

}
