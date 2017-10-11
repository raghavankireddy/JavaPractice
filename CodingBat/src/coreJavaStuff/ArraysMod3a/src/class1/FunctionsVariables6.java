package class1;

public class FunctionsVariables6 {

	public static void main(String[] args) {
		FunctionsVariables6 fv = new FunctionsVariables6();
		int x = fv.fn3();
	

	}
	
	public int fn1(){
		int[] arr2 = {1,2,3,4,5};
		for (int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]*arr2[i]);
		}
		return arr2.length;
	}

	public int fn2(){
		int[] arr2 = {1,2,3,4,5};
		System.out.print("{");
		for (int i=0;i<arr2.length;i++){
			if (i>0)
				System.out.print(",");
			System.out.print(arr2[i]);
		}
		System.out.println("}");
		System.out.println(arr2);
		return arr2.length;
	}

	public int fn3(){
		int[] arr1 = {2,4,6,8,0};
		int[] arr2 = new int[5];
		for (int i=0;i<arr1.length;i++){
			arr1[i] = 2*arr1[i];
			arr2[i]=arr1[i]+1;
		}
		printArray(arr1);
		printArray(arr2);
		return 0;
	}
	
	public int printArray(int[] arr){
		System.out.print("{");
		for (int i=0;i<arr.length;i++){
			if (i>0)
				System.out.print(",");
			System.out.print(arr[i]);
		}
		System.out.println("}");		
		return 0;
	}
	
}
