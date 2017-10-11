package oops_concepts;

//example of Multilevel inheritance

class Base1{

	int x=100;
	protected int b=55;
}

class Base2 extends Base1 {

	int x=90;
}

class Base3 extends Base2{

	int x=80;
}

class Base4 extends Base3{

	int x=70;
}


class Base5 extends Base4{
	
	int x=60;
}


public class Multilevel_Inheritance extends Base5{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x=50;
		
		Multilevel_Inheritance c=new Multilevel_Inheritance();
		
		//System.out.println("Value of a Base X " + super.x);
		
		System.out.println("Value of a Base1 X :" + ((Base1)c).x);
		System.out.println("Value of a Base2 X :" + ((Base2)c).x);
		System.out.println("Value of a Base3 X :" + ((Base3)c).x);
		System.out.println("Value of a Base4 X :" + ((Base4)c).x);
		System.out.println("Value of a Base5 X :" + ((Base5)c).x);
		System.out.println("Value of a Multilevel_Inheritance X :" + x);
		
		System.out.println("Value of a Protected Variable :" + c.b);
		
		
	}

}
