package first_Assignment;

public class Check_Prime extends Global_Fuction {

	public int num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Check_Prime cp=new Check_Prime();
		
		// Calling function from Base  Class
		
		int n=cp.input_Number(cp.num);
		
		int count=0;
		
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		
		if(count==2){
			System.out.println(n+ " is a Prime No.");
		}
		else
		{
			System.out.println(n+ " is Not a Prime No.");
		}
		
		
		
	}

}
