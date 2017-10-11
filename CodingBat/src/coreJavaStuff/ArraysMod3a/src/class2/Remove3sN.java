package class2;

public class Remove3sN {
	static int[] testcase1 = {21,19,17,11223100,23,15,11,8,4,31,34,30};
	
	public static void main(String[] args) {
		Remove3sN testInstance = new Remove3sN();
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
	
		int i=0,j=0,a,index=0;
		String s="";
		
		int arr1[]=new int[arr.length];
	
		
		for(i=0;i<arr.length;i++){
			a=arr[i];
			s=""+arr[i];
			index=s.indexOf('3');	
			if(index>=0 || a%3==0){
				continue;
			}
			else{
				arr1[j]=arr[i];
				j++;
			}
		}
			
		int[] arr2=new int[j];
	
		
		for(i=0;i<arr2.length;i++){
			arr2[i]=arr1[i];
		}
	
		return arr2;
	}
}
