package prob4Feb;

public class CountMaxOccurs {
	static String testcase1 = "Hello Worldiiiiiiii";
	
	public static void main(String[] args) {
		
		CountMaxOccurs testInstance= new CountMaxOccurs();
		char result = testInstance.Count(testcase1);
		System.out.println(result);
	

	}
	
	public char Count(String str){
		
		char ch=' ',ch1=' ';
		int i,count,max=0;
		
		for(i=0;i<str.length();i++){
			count=0;
			for(int j=0;j<str.length();j++){
				ch=str.charAt(j);
				
				if(ch==str.charAt(i)){
					count++;
				}
				
				System.out.println(count);
				}
			
			if(count>max){
				max=count;
				ch1=ch;
			}
		}
		
		return ch1;
	}

}
