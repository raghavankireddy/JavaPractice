package third2b;

public class JavaFile {
	static String testcase1 = "Sachin.java";

	public static void main(String[] args) {
		JavaFile testInstance= new JavaFile();
		boolean result = testInstance.isJavaFile(testcase1);
		System.out.println(result);
	
	}

	public boolean isJavaFile(String str){
		
		if(str.endsWith(".java"))
			return true;
		else 
			return false;
		
		
		
	}
}
