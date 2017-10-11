package fourth2b;

public class BinToInt {
	static String testcase1 = "11000000110110";
	static String testcase2 = "11111";
	static String testcase3 = "1000000";
	
	public static void main(String[] args) {
		BinToInt testInstance= new BinToInt();
		int result = testInstance.convert(testcase2);
		System.out.println("Result is : "+result);
	
	}

	public int convert(String binary){
	
		char ch;
		int i=0,pow=0,sum=0,len=0;
		len=binary.length();
		
		int arr[]=new int[len];
		
		
		for(i=0;i<binary.length();i++){
			ch=binary.charAt(i);
			
			arr[i]=(int)(ch-48);
			System.out.println(arr[i]);
			
			pow=power(2,((len-1)-i));
			sum=sum+arr[i]*pow;	
					
		}
			return sum;	
		}
		
		public int power(int num,int pow){
			
			int f=1;
			for(int i=0;i<pow;i++){
				f=f*num;
			}
			return f;
		}
		
		
	}
	


