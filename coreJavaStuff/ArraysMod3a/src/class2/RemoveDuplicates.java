package class2;

public class RemoveDuplicates {
	static int[] testcase1 = {0,21,19,0,17,15,0,11,8,4,2,0,};
	static int[] testcase2 = {1,2,3,4,0,1,4,3,2};

	public static void main(String[] args) {
		RemoveDuplicates testInstance = new RemoveDuplicates();
		int[] result = testInstance.remove(testcase1);
		System.out.print("{");
		for (int i=0;i<result.length;i++){
			if (i>0)
				System.out.print(",");
			System.out.print(result[i]);
		}
		System.out.println("}");
	

	}
	
	public int[] remove(int[] arr){
		
		  int end = arr.length;

		    for(int i = 0; i < end; i++){
		        for(int j = i + 1; j < end; j++){
		            if(arr[i] == arr[j]){                  
		                int shiftLeft = j;
		                for(int k = j+1; k < end; k++, shiftLeft++){
		                    arr[shiftLeft] = arr[k];
		                }
		                end--;
		                j--;
		            }
		        }
		    }

		    
		    int[] newarr = new int[end];
		    for(int i = 0; i < end; i++){
		        newarr[i] = arr[i];
		    }
		    return newarr;
	}

}
