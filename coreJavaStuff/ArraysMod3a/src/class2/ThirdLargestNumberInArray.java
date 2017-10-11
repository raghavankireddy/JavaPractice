package class2;

public class ThirdLargestNumberInArray {
	static int[] testcase1 = {0,21,19,0,17,15,0,11,908,4,299,110,1000};
	

	public static void main(String[] args) {
		ThirdLargestNumberInArray testInstance = new ThirdLargestNumberInArray();
		int result = testInstance.thirdLargest(testcase1);
		System.out.print("Result : "+result);
	

	}
	
	public int thirdLargest(int[] arr){
		
		int max1=0,max2=0,max3=0;
		
		int[] arr1=new int[arr.length-1];
		int[] arr2=new int[arr1.length-1];
		
		max1=maximumValue(arr);
		System.out.println("First Max " +max1);
				
		arr1=ShortingArray(arr, max1);
		
		/*for(int i=0;i<arr1.length;i++){
			System.out.println("New Array"  + arr1[i]);
		}*/
		
		max2=maximumValue(arr1);
		System.out.println("Second Max " +max2);
		
		arr2=ShortingArray(arr1, max2);
		
		/*for(int i=0;i<arr2.length;i++){
			System.out.println("New Array 2nd"  + arr2[i]);
		}*/
		
		max3=maximumValue(arr2);
		System.out.println("Third Max " +max3);
		
		
		
		
		return max3;
	}
	
	public int maximumValue(int[] array){
		
		int max,i=0;
		
		max=array[0];
		
		for(i=0;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
	
			return max;
	}
	
	public int[] ShortingArray(int[] arrayagain,int max){
		
		int[] arr1=new int[arrayagain.length-1];
		int i,k=0;
		
		for(i=0;i<arrayagain.length;i++){
			
			if(arrayagain[i]==max){
			}
			else{
				arr1[k]=arrayagain[i];
				k++;
			}
		}
		
		return arr1;
	}
	

}
