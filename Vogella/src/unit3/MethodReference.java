package unit3;

public class MethodReference {

	public static void main(String[] args) {

		//Thread t = new Thread( () -> printMessage());
		
		// Method Reference Example
		Thread t = new Thread(MethodReference::printMessage);
		t.start();
	}

	public static void printMessage(){
		System.out.println("Hello Java 8");
	}
}
