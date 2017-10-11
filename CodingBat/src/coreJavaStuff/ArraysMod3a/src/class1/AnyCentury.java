package class1;

public class AnyCentury {


	static int[] testcase1 = {21,19,17,15,111,8,4,2,0};
	
	public static void main(String[] args) {
		AnyCentury testInstance = new AnyCentury();
		boolean result = testInstance.century(testcase1);
		System.out.print("Result : "+result);
	
	}
	
	public boolean century(int[] arr){
		
		int flag=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=100){
				flag=1;
			}
		}
		
		if(flag==1)
			return true;
		else
			return false;
		
	}

}
