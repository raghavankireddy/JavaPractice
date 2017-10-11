package problems;

public class problem1 {

	public static void main(String[] args) {

		System.out.println("Hello");

		int n=754621;
		int n1=n;
		int r =0;
		
		int count = 0;
		
		while(n!=0){
		
			r=n%10;
			//System.out.println(r);
			count++;
			n=n/10;
		}
		
		System.out.println("No. Of Digits :" + count);
		
		int val=0,j=1;
		
		for (int i = 0; i < count; i++) {
			
			while(n1!=0){
				r=n1%10;
				
				val=val+j*r;
				System.out.println(val);
				j=j*10;
				
				n1=n1/10;
			}
		}
		
		System.out.println(val);
		
		
	}

}
