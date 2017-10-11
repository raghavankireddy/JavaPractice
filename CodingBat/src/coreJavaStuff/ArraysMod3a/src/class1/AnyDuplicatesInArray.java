package class1;

public class AnyDuplicatesInArray {
	static int[] testcase1 = {21,5,19,17,15,11,8,4,2,0};
		static int[] testcase2 = {-21,-19,0,-17,-15,-11,-8,-4,-2,0};
		

	public static void main(String[] args) {
		AnyDuplicatesInArray testInstance = new AnyDuplicatesInArray();
		boolean result = testInstance.anyDuplicates(testcase1);
		System.out.print("Result : "+result);
	
	}

	public boolean anyDuplicates(int[] arr){
		
		int [] arr1=new int[arr.length];
		int i,j=0,count=0,flag=0;
		
		for(i=0;i<arr.length;i++){
			arr1[j]=arr[i];
			System.out.println(arr1[j]);
			j++;
		}
		
		for(i=0;i<arr.length;i++){
			count=0;
			
			for(j=0;j<arr.length;j++){	
				if(arr[i]==arr1[j]){
					count++;
				}
				if(count==2){
					flag=1;
				}
				
			}
		
		}
		if(flag==1){
			return true;
		}
		else 
			return false;
		
	}

}
