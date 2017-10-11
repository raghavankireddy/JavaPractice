package class2;

public class DryRun_ArrayPassing {
	

	public static void main(String[] args) {
		DryRun_ArrayPassing ob=new DryRun_ArrayPassing();
		
		int[] array1=new int[]{1,11,22};
		int[] array2=new int[]{2,4,8};
		
		ob.fn4(array1,array2);

	}
	
	
	// First Case
		
		//fn1({3,6,9,12})
		//fn1({1,2,3,4})
		
	public void fn1(int[] arr){
		System.out.println(arr[1]);
		arr = fn1_help(arr);
		System.out.println(arr[2]);		
	}
	

	public int[] fn1_help(int[] arr){
		for (int i=0;i<arr.length;i++)
			arr[i] = arr[i]*2;
		return arr;
	}
	
	
	
	// Second Case
		
		//fn2({13,16,19,5})
		//fn2({2,4,8,16,32})

	public void fn2(int[] arr){
		System.out.println(arr[1]);
		fn2_help(arr);
		System.out.println(arr[2]);		
	}
	
	public void fn2_help(int[] arr){
		for (int i=0;i<arr.length;i++) {
			arr[i] = arr[i]+arr[0];
			System.out.println(arr[i]);
		}
	}
	
		
	//Third Case
	
		//fn3({2,4,6,8},{3,5,7,9})
		//fn3({12,14,16},{6,4,2})
	
		public void fn3(int[] arr1, int[] arr2){
			arr1 = fn3_help(arr1,arr2);
			System.out.println(arr1[1]+":"+arr2[1]);		
		}
		
		public int[] fn3_help(int[] arr1, int[] arr2){
			for (int i=0;i<arr1.length;i++) {
				arr1[i] = arr1[i]*2;
				arr2[i] = arr2[i]+5;
			}
			return arr1;
		}
		
	//Fourth Case
		
		//fn4({1,11,22},{2,4,8})
		//fn4({10,20,30},{3,9,27})
		
		
		public void fn4(int[] arr1, int[] arr2){
			fn4_help(arr1,arr2);
			System.out.println(arr1[2]+":"+arr2[2]);		
		}
		
		public void fn4_help(int[] arr1, int[] arr2){
			for (int i=0;i<arr1.length;i++) {
				arr1[i] = arr1[i]+15;
				arr2[i] = arr2[i]*3;
			}
		}


	public boolean has3(int number){
		
		int rem=0;
		while(number!=0){
			rem=number%10;
			if(rem==3){
				return true;
			}
			number/=10;
		}
		return false;
	}

	
	
	
	
}
