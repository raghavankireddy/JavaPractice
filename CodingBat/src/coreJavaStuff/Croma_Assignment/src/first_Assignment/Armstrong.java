package first_Assignment;

public class Armstrong extends Global_Fuction{

	public int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Armstrong am=new Armstrong();
		int n=am.input_Number(am.num);
		
		int rem=0,sum=0,orig=n;
		
		while(n!=0){
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		
		if(sum==orig){
			System.out.println(orig+ " is an Armstrong Number");
		}
		else
		{
			System.out.println(orig+ " is not an Armstrong Number");
		}
	}

}
