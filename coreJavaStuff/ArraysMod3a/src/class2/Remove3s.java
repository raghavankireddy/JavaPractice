package class2;

public class Remove3s {
	static int[] testcase1 = {21,19,17,11223100,23,15,11,8,4,31,34,30};
	

	public static void main(String[] args) {
		Remove3s testInstance = new Remove3s();
		int[] result = testInstance.remove(testcase1);
		System.out.print("{");
		for (int i=0;i<result.length;i++){
			if (i>0)
				System.out.print(",");
			System.out.print(result[i]);
		}
		System.out.println("}");
	

	}
	public int[] remove(int[] arr){
		
		int i=0,j=0,count=0,countwhile=0,rem=0,countif=0;
		
		//Checking Multiple of 3
			for(i=0;i<arr.length;i++){
				
				if(arr[i]%3==0){
					countif++;
				}
			}
				
			
			int[] arr1=new int[arr.length-countif];
			
				for(i=0;i<arr.length;i++){
					if(arr[i]%3!=0){
						arr1[j]=arr[i];
						j++;	
					}
					
				}
					
				
				
			
			
			//System.out.println(arr2.length);	
			i=0;	
			int k=0,val=0;
			
			while(arr1.length!=count){
				count++;
				val=arr1[i];
				while(val!=0){
					
					rem=val%10;
						
					if(rem==3){
							countwhile++;
					}
					
					/*else{
						arr2[k]=arr1[i];
						k++;
					}*/
					
				val=val/10;
				}
				
				i++;
				
			}
			
			int arr2[]=new int[arr1.length-countwhile];
			
			System.out.println("last Length" + arr2.length);
			
			
			
			i=0;	
			 k=0;
			 val=0;
			 int l=0;
			 rem=0;
			int ct=0;
			while(arr1.length!=ct){
				ct++;
				val=arr1[i];
				while(val!=0){
					
					rem=val%10;	
					if(rem!=3){
						//System.out.println(arr1[i]);
						//System.out.println("hi");
							arr2[l]=arr1[i];
							System.out.println(arr1[l]);
							l++;
							
					}
					
					
					
				val=val/10;
				}
				
				i++;
				
			}
			
			i=0;
			for(i=0;i<arr2.length;i++){
				System.out.println(arr2[i]);
			}
			
					
			System.out.println("Inside while "+countwhile);
				
		
		
		
		
		return arr1;
	}

}
