package first_Assignment;


public class Factorial extends Global_Fuction{

	public int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial fl=new Factorial();
		int n=fl.input_Number(fl.num);
		
		int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		System.out.println("The factorial of " + n + " is " + f);
	}

}
