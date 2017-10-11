package first_Assignment;

public class Palindrome_Check extends Global_Fuction {

	public int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome_Check pc=new Palindrome_Check();
		
		int n=pc.input_Number(pc.num);
		
		int rem=0,orig=0,sum=0;
		
		//Keeping the original value for future reference
		orig=n;
		
		while(n!=0){
			rem=n%10;
			sum=sum*10+rem;
			n/=10;
		}	
		if(sum==orig){
			System.out.println(orig+ " is a palindrome Number");
		}
		else
		{
			System.out.println(orig+ " is not a palindrome Number ");
		}
		
	}

}
