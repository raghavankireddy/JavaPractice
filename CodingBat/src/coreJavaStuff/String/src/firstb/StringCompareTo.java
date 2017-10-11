
public class StringCompareTo {
	static String testcase1 = "abCdEfGh";
	static String testcase2 = "aaBbCcDd";
	
	static String testcase3 = "hello";
	static String testcase4 = "hi";

	
	public static void main(String[] args) {
		
		StringCompareTo testInstance = new StringCompareTo();
		int result = testInstance.newCompareTo(testcase3,testcase4);
		System.out.println("Result : "+result);
		

	}
	
	public int newCompareTo(String str1, String str2){
	
		int i,val1=0,val2=0,value=0,flag=0,len1=0,len2=0,len=0,diff=0;
		char ch1,ch2;
		
		len1=str1.length();
		len2=str2.length();
		
		if(len1>len2)
			len=len2;
		else
			len=len1;
		
			for(i=0;i<len;i++){
				flag=0;
			
				ch1=str1.charAt(i);
				ch2=str2.charAt(i);
				
				val1=(int)(ch1);
				val2=(int)(ch2);
				
					
						
					//Case of Inequality
					if((val1!=val2) && (i==0)){
						flag=1;
						value=-1;
						break;
					}
					
					else{
						
						if(val1==val2){
							value=0;
							flag=1;
						}
						
						
						//Equal only initial, then further not equal
						if( (val1!=val2) && (str1.charAt(i-1)==str2.charAt(i-1))  ){
							diff=val1-val2;
								
							if(diff<0){
								value=1;
								flag=1;
								break;
							}
							else{
								value=1;
								flag=1;
								break;
							}
							
							
							
						}
						
						
						
						
					}
					
					
			}
				
		
		
			if(flag==1)
				return value;
			else
				return 2;
			
	}

}
