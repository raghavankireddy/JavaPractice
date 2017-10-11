package prob4Feb;

public class CheckOccurs {
	static String testcase1 = "Hello";
	static char testcase2 = 'H';
	
	
	public static void main(String[] args) {
		CheckOccurs testInstance= new CheckOccurs();
		boolean result = testInstance.check(testcase1);
		System.out.println(result);
	

	}
	
		
public boolean check(String str1){
		
		int i=0,value=0,flag=0,index=0,lastindex=0;
		
		boolean b=false;
		char ch;
		
		
		
		
		for(i=0;i<str1.length();i++){
			
			ch=str1.charAt(i);
			index=str1.indexOf(ch);
			lastindex=str1.lastIndexOf(ch);
			
			if(index!=lastindex){
				flag=1;
				break;
			}
		
		}
		
		if(flag==1){
			return true;
		}
		else{
			return false;
		}
	}

}


