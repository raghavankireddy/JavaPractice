package first_Assignment;

public class Odd_Even extends Global_Fuction{
	
	public int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Odd_Even oe=new Odd_Even();
		int n=oe.input_Number(oe.num);
		
		
		if(n%2==0){
			System.out.println(n + " is an Even no.");
		}
		else{
			System.out.println(n + " is an Odd no.");
		}
		
	}

}
