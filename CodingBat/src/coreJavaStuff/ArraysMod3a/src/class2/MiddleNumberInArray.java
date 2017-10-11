package class2;

public class MiddleNumberInArray {
	
	static int[] testcase1 = {0,21,19,0,17,15,0,11,908,4,299,110,22};
	static int[] testcase2 = {5,8,14,1,5678};
	static int[] testcase3 = {2,4,6,8,10,1,3,5,7,9,0};
	

	public static void main(String[] args) {
		MiddleNumberInArray testInstance = new MiddleNumberInArray();
		int result = testInstance.midNumber(testcase1);
		System.out.print("Result : "+result);
	

	}
	
	public int midNumber(int[] arr){
		
		int i,temp,j=0,value=0;
		
		// Ascending Order
		
		for(i=0;i<arr.length-1;i++){
			
			for(j=1;j<arr.length-i;j++){
			
				if(arr[j-1]>arr[j]){
					
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
			
			
		}
		
		
		
		// Descending Order
		
		for(i=0;i<arr.length-1;i++){
			
			for(j=1;j<arr.length-i;j++){
			
				if(arr[j-1]<arr[j]){
					
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
			
			
		}
		
		for(i=0;i<(arr.length/2);i++){
			System.out.println(arr[i]);
		}
	
		value=arr[i];
		
		//System.out.println("Val" + value);
		
		return value;
				
	}

}
