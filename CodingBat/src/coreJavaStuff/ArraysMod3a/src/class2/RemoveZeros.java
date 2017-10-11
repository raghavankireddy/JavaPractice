package class2;

public class RemoveZeros {
	static int[] testcase1 = {0,21,19,0,17,15,0,11,8,4,2,0};
	static int[] testcase2 = {1,2,0,3,4,0,5,1,0,2,0,2};
	

	public static void main(String[] args) {
		
		RemoveZeros testInstance = new RemoveZeros();
		int[] result = testInstance.remove(testcase2);
		System.out.print("{");
		for (int i=0;i<result.length;i++){
			if (i>0)
				System.out.print(",");
			System.out.print(result[i]);
		}
		System.out.println("}");
	

	}

	public int[] remove(int[] arr){
		
		int i,j=0,count=0;
		
		
		for(i=0;i<arr.length;i++){
			if(arr[i]==0){
				count++;
			}
		}
		
		int[] arr1=new int[arr.length-count];
		
		for(i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr1[j]=arr[i];
				j++;
			}
		}
		return arr1;
	}
}
