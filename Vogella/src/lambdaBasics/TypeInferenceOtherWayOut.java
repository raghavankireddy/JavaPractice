package lambdaBasics;

public class TypeInferenceOtherWayOut {

	public static void main(String[] args) {

		printLambdaExpression(s-> s.length());
		
	}

	public static void printLambdaExpression(StringLengthCount l){
		System.out.println(l.getLength("Kaoushik"));
	}

	
	
	
}
