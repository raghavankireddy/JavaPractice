
public class StringCompareToIgnoreCase {
	
	static String testcase1 = "Abcdefi";
	static String testcase2 = "aBcDEf";

	static String testcase3 = "abcdefghi";
	static String testcase4 = "abcdefg";


	static String testcase5 = "hello";
	static String testcase6 = "World";

	static String testcase7 = "abcdefgh";
	static String testcase8 = "ABCDEFGG";
	
	static String testcase9 = "123456";
	static String testcase10 = "99";
	
	static String testcase11 = "abcdefg";
	static String testcase12 = "abcdefghijk";
	
	static String testcase13 = "abcdefgh";
	static String testcase14 = "abcdefgh";



	
	
	public static void main(String[] args) {
		StringCompareToIgnoreCase testInstance = new StringCompareToIgnoreCase();
		int result = testInstance.newCompareToIgnoreCase(testcase11,testcase12);
		System.out.println("Result : "+result);
	}

	public int newCompareToIgnoreCase(String str1, String str2){
		
		char ch1,ch2;
		int i,val1=0,val2=0,value=0,flag=0,len1=0,len2=0,len=0,diff=0;
		
		len1=str1.length();
		len2=str2.length();
		
		if(len1>len2){
			
			
			for(i=0;i<len2;i++){
				
				ch1=str1.charAt(i);
				ch2=str2.charAt(i);
				
				//In case of "abcdefghi" and "abcdefg"
				if(ch1==ch2){
					value=1;
					flag=1;
				}	
				
				//In case of "123456" and "99" 
				val1=(int)(ch1);
				val2=(int)(ch2);
				
				if((val1!=val2) && (i==0)){
					flag=1;
					value=-1;
					break;
				}
				
			}
		}
		
		else{
			
		
		//Now, In case of "abcd" or "abcdef", which ever is shortest
		
		if(len1>len2)
			len=len2;
		else
			len=len1;
		
		//Assigning Shortest Length 
		
		for(i=0;i<len;i++){
			
			flag=0;
			
			ch1=str1.charAt(i);
			ch2=str2.charAt(i);
			
			val1=(int)(ch1);
			val2=(int)(ch2);
			
			//Converting into Equal Case all together
			if(val1>=65 && val1<=90){
				val1=val1+32;
				
			}
			
			if(val2>=65 && val2<=90){
				val2=val2+32;
			}	
				
			//Case of Inequality, "hello" , "world"
			if((val1!=val2) && (i==0)){
				flag=1;
				value=-1;
				break;
			}
			
			else{
				
				// Proper case of equality, "abcdef" and "abcdef"
				if(val1==val2 && len1==len2){
					value=0;
					flag=1;
				}
				
				// In case of "Abcdef" and "abcdefghi"
				if(val1==val2 && len1<len2){
					value=-1;
					flag=1;
				}
				
				//Equal only initial, then further not equal
				if( (val1!=val2) && (str1.charAt(i-1)!=str2.charAt(i-1)) ) {
					diff=val1-val2;
						
					if(diff>0){
						value=1;
						flag=1;
						break;
					}
					
					if(val1==val2){
						System.out.println("hi");
						value=-1;
						flag=1;
						break;
					}
				}
					
			}
			
			
				
				
		}// for loops ends here
		
}//else ends
		
		if(flag==1)
			return value;
		else
			return 2;
		
		
	}
}
