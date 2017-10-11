package abstractExample;

public class Cat implements Run,Walk {

	public int getSpeed(){
		return 1;
	}
	public static void main(String[] args) {

		System.out.println(new Cat().getSpeed());
	}

}
