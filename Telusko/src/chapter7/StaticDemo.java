package chapter7;

public class StaticDemo {

	int num1 = 9;
	static int num2 = 10;

	public static void main(String[] args) {
		// System.out.println(i);
		
		StaticDemo.num2 = 90;

		System.out.println(num2);
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();
		StaticDemo ob3 = new StaticDemo();
		ob1.show();
		
		ob1.num1=3;
		ob2.num1=4;
		ob3.num1=5;
		
		System.out.println(ob1.num1);
		System.out.println(ob2.num1);
		System.out.println(ob3.num1);

		

	}

	public void show() {
		StaticDemo.num2=9;
		System.out.println("Value of Num 2 = " + num2);
	}

}
