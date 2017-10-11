package third2b;

public class EndsWithIng {
	static String testcase1 = "No, I am going to Noida you Guys coming";
	

	public static void main(String[] args) {
		EndsWithIng testInstance= new EndsWithIng();
		boolean result = testInstance.endsIng(testcase1);
		System.out.println(result);
	

	}

	public boolean endsIng(String str){
		
		if(str.endsWith("ing")){
			return true;
		}
		else
			return false;
		
	}
}
