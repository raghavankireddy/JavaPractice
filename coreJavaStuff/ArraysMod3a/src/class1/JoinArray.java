package class1;

public class JoinArray {

	static int[] testcase1 = {1,14,15,2,3};
	static int[] testcase2 = {20,30,40,30,20};
	

	public static void main(String[] args) {
		JoinArray testInstance = new JoinArray();
		int[] result = testInstance.join(testcase1,testcase2);
		System.out.print("{");
		for (int i=0;i<result.length;i++){
			if (i>0)
				System.out.print(",");
			System.out.print(result[i]);
		}
		System.out.println("}");
	
	}
	
	public int[] join(int[] arr1,int[] arr2){
		
		int i=0,j=0,k=0;
		
		int arr3 []=new int[arr1.length+arr2.length];
		
		for(i=0;i<arr1.length;i++){
			arr3[j]=arr1[i];
			j++;
			k=j;
		}
		
		for(i=0;i<arr2.length;i++){
			arr3[k]=arr2[i];
			k++;
		}
		
		return arr3;
		
	}

}
