package third2b;

public class RemoveDuplicateChars {
	static String testcase1 = "DPMD Jayawardene hjhjhjhjpopo";
	static String testcase2 = "Hello";
	

	public static void main(String[] args) {
		RemoveDuplicateChars testInstance= new RemoveDuplicateChars();
		String result = testInstance.remove(testcase2);
		System.out.println(result);
	
	}
	
	public String remove(String str){
	
		char ch1;
		String s="";
		int i=0,index=0,j=0;
		
		for(i=0;i<str.length();i++){
			ch1=str.charAt(i);
			
			index=str.indexOf(ch1);
			
			if(index==i){
				s=s+ch1;
			}
				
			
		}
	
		
	return s;
	}
}
	/*public String remove(String str){
		
		char ch1;
		String s="";
		int i=0;
		boolean b=false;
		
		for(i=0;i<str.length();i++){
			
			ch1=str.charAt(i);
			
			if(i==0){
				s=s+str.charAt(i);
			}
			
			else{
				b=occurs(s,ch1);
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
	
	public boolean occurs(String str1,char ch){
		
		int i=0,value=0,flag=0;
		String str2=""+ch;
		
		boolean b=false;
		
		for(i=0;i<str1.length()-str2.length()+1;i++){
			
			b=(str1.substring(i,i+str2.length())).equals(str2);
			
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
		
		
	}*/
	
	


