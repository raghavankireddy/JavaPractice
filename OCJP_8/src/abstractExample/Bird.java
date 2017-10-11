package abstractExample;

public abstract class Bird {

	private void fly(){
		System.out.println("dsfsfsfs Bird");
	}
	
	public static void main(String args[]){
		Bird b = new Pelician();
		b.fly();
	}
}
