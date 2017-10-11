package assesment_test;

public class Exception_Check {

	public static void main(String[] args) {

		System.out.println("a");
		
		try{
			System.out.println("b");
			throw new IllegalArgumentException();
		}
		catch(RuntimeException exp){
			System.out.println("c");
		}
		finally{
			System.out.println("d");
		}
		System.out.println("e");
	}

}
