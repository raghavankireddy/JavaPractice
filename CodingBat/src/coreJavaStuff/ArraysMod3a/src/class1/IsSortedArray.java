package class1;

public class IsSortedArray {
	static int[] testcase1 = {-21,-19,-17,-15,-11,-8,-4,-2,0};
	static int[] testcase2 = {21,19,17,15,11,8,4,2,0};
	static int[] testcase3 = {1,3,5,5,7};
	static int[] testcase4 = {-5,11,9,2};
	static int[] testcase5 = {1,2,3,4,-1,-2};
	

	public static void main(String[] args) {
		IsSortedArray testInstance = new IsSortedArray();
		boolean result = testInstance.isSorted(testcase3);
		System.out.print("Result : "+result);
	
	}
	
	public boolean isSorted(int[] arr){
	
			int i=0,ascending=0,descending=0;
			
			for(i=0;i<arr.length-1;i++){
				
				// Descending
				if(arr[i]>arr[i+1]){
					descending=1;
				}
				
				//Ascending
				else if(arr[i]<arr[i+1]){
					ascending=1;
				}
			}
			
			//Not of Order
			if(ascending==1 && descending==1)
				return false;
			
			else if(ascending==1){
				return true;
			}
			else if(descending==1){
				return true;
			}
			// Case of Equal
			else
				return true;
			}

}
