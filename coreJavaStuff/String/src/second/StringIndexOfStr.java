package second;

public class StringIndexOfStr {
	static String testcase1 = "hello world";
	static String testcase2 = "world";
							   
	
	static String testcase3 = "abcdefgh";
	static String testcase4 = "cdef";
	
	public static void main(String[] args) {
		StringIndexOfStr testInstance = new StringIndexOfStr();
		int result = testInstance.newIndexOf(testcase1,testcase2);
		System.out.println("Result : "+result);
	

	}
	
	public int newIndexOf(String str1, String str2){
		char ch1,ch2;
		int i=0,j=0,flag=1,len1=0,len2=0,value=0,count=0;
		
		len1=str1.length();
		len2=str2.length();
		
		ch2=str2.charAt(0);
		
	int	m=1;
	
		//Getting the First Occurence and storing it
		for(i=0;i<len1;i++){
			
			ch1=str1.charAt(i);
			
			if(ch1==ch2){
				value=i;
				
				for (int k=i+1;k<len1;k++)
				{
					
					ch1=str1.charAt(++i);
					ch2=str2.charAt(m++);

					//First Non Matching Found
					
					if(ch1!=ch2){   
						flag=0;
						break;
					}
					
					
				}
			 break;
			}
		}
		
		
			
		if(flag==1 && m==len2)
				return value;
			else
				return -1;
			
	
	}
	
	

}
