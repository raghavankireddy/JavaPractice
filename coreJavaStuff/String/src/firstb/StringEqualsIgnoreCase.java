
public class StringEqualsIgnoreCase {
	
	static String testcase1 = "abcdef";
	static String testcase2 = "AbCdEf";
	

	public static void main(String[] args) {

		StringEqualsIgnoreCase testInstance = new StringEqualsIgnoreCase();
		boolean result = testInstance.newEqualsIgnoreCase(testcase1,testcase2);
		System.out.println("Result : "+result);
	
	}

	public boolean newEqualsIgnoreCase(String str1, String str2){
		
		int i,flag=0,val1=0,val2=0;
		char ch1,ch2;
		
		int len1=str1.length();
		int len2=str2.length();
				
		if(len1==len2){
			for(i=0;i<str1.length();i++){
				flag=0;
				
				ch1=str1.charAt(i);
				ch2=str2.charAt(i);
			
					if(ch1==ch2){
						flag=1;
					}
				
					else{
					
						if(ch1!=ch2){
						
							val1=(int)(ch1);
							val2=(int)(ch2);
						
								if(val1>val2){
									val1=val1-32;
								
									if(val1==val2){
										flag=1;	
									}
								}
							
								if(val1<val2){
									val1=val1+32;
								
									if(val1==val2){
										flag=1;
									}
							}
					
						
						}
					
					
					}
					
			
		}
	}
		
		if(flag==1)
			return true;
		else
			return false;
		
		
	
			

}

}