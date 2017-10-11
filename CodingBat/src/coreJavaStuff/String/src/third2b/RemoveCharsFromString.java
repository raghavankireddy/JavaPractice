package third2b;

public class RemoveCharsFromString {

	static String testcase1 = "Hello";
	static String testcase2 = "World";

	public static void main(String[] args) {
		RemoveCharsFromString testInstance= new RemoveCharsFromString();
		String result = testInstance.remove(testcase1,testcase2);
		System.out.println(result);

	}
	
	public String remove(String str1, String str2){
		
		String s="";
		char ch1;
		int i=0,index=0;
		
		for(i=0;i<str1.length();i++){
			ch1=str1.charAt(i);
			
			index=str2.indexOf(ch1);
			
			System.out.println(index);
			
			if(index<0){
				s=s+ch1;
			}
		}
		
		return s;
	}
	
	/*public String remove(String str1, String str2){
		
		char ch1;
		String s="";
		int i=0;
		boolean b=false;
		
		for(i=0;i<str1.length();i++){
			
			ch1=str1.charAt(i);
			
			if(i==0){
				s=s+str1.charAt(i);
			}
			
			else{
				b=occurs(ch1,str2);
				System.out.println(b);
				if(b==true){
					
				}
				
				else{
					s=s+ch1;
				}
			}
		}
		return s;
	}
	
	
	public boolean occurs(char ch,String str2){
		
		int i=0,value=0,flag=0;
		String str1=""+ch;
		
		boolean b=false;
		
		for(i=0;i<str2.length();i++){
			
			b=(str2.substring(i,str2.length()-1)).equals(str1);
			
			if(b==true){
				flag=1;
				//value=i;
				break;
			}	
		
			
		}
		
		
		if(flag==1)
			return true;
		else
			return false;
		
		
	}
	

	
	
	
*/
}
