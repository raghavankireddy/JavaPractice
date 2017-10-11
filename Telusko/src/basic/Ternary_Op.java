package basic;

public class Ternary_Op {

	public static void main(String[] args) {

		Object obj1;
		Object obj2;
		
		if(true){
			obj1= new Integer(10);
		}
		else{
			obj1=new Double(15.0);
		}
		
		System.out.println(obj1);
		
		obj2 = true ? new Integer(10) : new Double(15.0);
		
		System.out.println(obj2);
		
		// The Trick is, whenever we use Ternary operator, it will check the value of highest data type and whichever is maximum
		// It will assign that.
	}

}
