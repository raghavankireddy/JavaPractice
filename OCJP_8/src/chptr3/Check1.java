package chptr3;

public class Check1 {
	static {
		add(2);
	}

	static void add(int num) {
		System.out.print(num + " ");
	}

	Check1() {
		add(5);
	}

	static {
		add(4);
	}
	{
		add(6);
	}
	static {
		new Check1();
	}
	{
		add(8);
	}

	public static void main(String[] args) {
	}
}
