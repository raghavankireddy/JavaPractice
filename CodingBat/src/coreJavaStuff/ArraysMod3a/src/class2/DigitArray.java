package class2;

public class DigitArray {


	static String testcase1 = "9988776655";
	static String testcase2 = "00123456789013579";
	
	public static void main(String[] args) {
		DigitArray testInstance = new DigitArray();
		int[] result = testInstance.getDigitArray(testcase2);
		
		System.out.print("{");
		
		for (int i=0;i<result.length;i++){
			if (i>0)
				System.out.print(",");
			System.out.print(result[i]);
		}
		
		System.out.println("}");
	}
	

	public int[] getDigitArray(String str){
		
		int i=0,j=0;
		
		int[] arr=new int[10];
		
		for(i=0;i<=9;i++)
		{
			j=occurs(str,i);
			arr[i]=j;
		}
	
		return arr;
	}
	
	public int occurs(String str1,int ch){
		
		//value of array
		String str2=""+ch;
		
		int count=0;
		
		for(char ch1 : str1.toCharArray()){
			if(str2.equals(""+ch1))
				count++;
		}
		
		
		return count;
		
		
	}
	

}
