package lambdaBasics;

public class LambdaGreeting {

	public static void main(String[] args) {

		MyLambda myLambdaGreet = () -> System.out.println("Hello World");

		myLambdaGreet.foo();
		// Compiler can figure out, it is expecting the return Type of integer
		MyAdd lambdaAdd = (a, b) -> a + b;

		System.out.println(lambdaAdd.add(6, 7));

		MyLambda innerGreeting = new MyLambda() {

			@Override
			public void foo() {
				System.out.println("Hello World From Inside");
			}
		};

		innerGreeting.foo();
	}

}
