
public class RemoveSmallest {
	
	static int testcase1 = 1237456;
	static int testcase2 = 1293456;
	
	public static void main(String[] args) {
		
		RemoveSmallest testInstance= new RemoveSmallest();
		int result = testInstance.removeMin(testcase2);
		System.out.println(result);

	}

	public int removeMin(int num){
		
		int rem=0,min=0,i=0,copy=0,pos=0,mod=0,value=0;
		copy=num;
		
		if(num<10){
			value=0;
		}
		
		else{
			min=num%10;
			while(num>0){
				++i;
				rem=num%10;
				if(rem<min){
					pos=i;
					min=rem;
				}
				num=num/10;
			}
			
		}
		

		System.out.println("Position in if :" + pos);
		
		mod=copy%power(10,pos-1);
		copy=copy/power(10,pos);
		copy=copy*power(10,pos-1)+mod;
		
		
		
		
		
		
		
		return copy;
	}
	
	public int power(int n,int pow){
		
		int f=1;
		for(int i=0;i<pow;i++){
			f=f*n;
		}
		return f;
	}
}
