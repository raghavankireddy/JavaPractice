package runnable_Thread;

public class Runnable_Example {

	public static void main(String[] args) {

		Thread myThread = new Thread(new  Runnable() {
			public void run() {
				System.out.println("Printed Inside Run ()");
			}
		});
		
		myThread.run();
		
		Thread 	myLambdaThread = new Thread( () -> System.out.println("Printed From Lambda Method"));
		
		myLambdaThread.run();
	}
	
	
	

}
