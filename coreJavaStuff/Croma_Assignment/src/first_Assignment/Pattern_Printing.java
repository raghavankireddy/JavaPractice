package first_Assignment;

public class Pattern_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5,i=0,j=0;
		
		// for printing first half pattern
		
		for(i=1;i<=n;i=i+2){
			
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			
			if(j>n){
				//System.out.println("hi");
				break;
			}
			
			System.out.println();
		}
		
		
		//System.out.println(j);
		
		
		// for printing lower half pattern
		
		for(i=1;i<=n;i=i+2){
			for(int k=j-i;k<n && k>=1;k--){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println(j-1);

	}

}
