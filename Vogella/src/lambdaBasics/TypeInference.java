package lambdaBasics;

public class TypeInference {

	public static void main(String[] args) {

		// If there is an one arguement, then you can remove the braces before/after it.
		StringLengthCount myLambda = s -> s.length();
		
		System.out.println(myLambda.getLength("Kaoushik"));
	}
	
	

}
