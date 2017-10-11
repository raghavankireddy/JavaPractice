package class1;

public class ReverseArray {
	static int[] testcase1 = {0,21,19,0,17,15,0,11,8,4,2,0};
	

	public static void main(String[] args) {
		ReverseArray testInstance = new ReverseArray();
		int[] result = testInstance.reverse(testcase1);
		System.out.print("{");
		for (int i=0;i<result.length;i++){
			if (i>0)
				System.out.print(",");
			System.out.print(result[i]);
		}
		System.out.println("}");
	
	}
	
	public int[] reverse(int[] arr){
		
		int [] arr1=new int[arr.length];
		int k=0;
		
		for(int i=arr.length-1;i>=0;i--){
			arr1[k]=arr[i];
			k++;
		}
			
		return arr1;
	}

}
