package class1;

public class FormLargestNumber {

	static int[] testcase1 = {1,2,3,4,5,6,1,2,3,4};
	

	public static void main(String[] args) {
		FormLargestNumber testInstance = new FormLargestNumber();
		String result = testInstance.form(testcase1);
		System.out.print("Result : "+result);
	
	}
	public String form(int[] arr){
		
		String s="";
		int[] arr1=new int[arr.length];
		int count=0,i,j=0;
		
		for(i=9;i>=0;i--){
			arr1[j]=i;
			j++;
		}
					
		j=0;
		for(i=arr.length-1;i>=0;i--){
			count=0;
			
				while(count!=arr[i]){
					s=s+arr1[j];
					count++;
				}
				j++;
		}
		
		return s;
	}

}
