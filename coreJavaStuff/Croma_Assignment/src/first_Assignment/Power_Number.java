package first_Assignment;

public class Power_Number extends Global_Fuction{

	public int num;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Power_Number pw=new Power_Number();
		int n=pw.input_Number(pw.num);
		
		
		int pow=3,f=1;
		
		for(int i=1;i<=pow;i++){
			f=f*n;
		}
		
		System.out.println("The value of a " + n + " to the power of " + pow + " is " + f);
		
	}

}
