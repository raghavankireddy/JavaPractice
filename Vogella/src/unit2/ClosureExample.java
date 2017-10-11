package unit2;

public class ClosureExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		//b=9; - Not Allowed
		// Here b is effectively final, changing the value of b, will result into an error, compiler assume you to keep b as final.
		doProcess(a, i -> System.out.println("Value is : " +(a+b)));
		
	}

	public static void doProcess(int i,Process p) {
		p.process(i);
	}

	interface Process {
		void process(int i);
	}
}
